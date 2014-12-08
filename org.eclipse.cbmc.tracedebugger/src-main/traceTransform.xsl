<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	extension-element-prefixes="exsl" xmlns:exsl="http://exslt.org/common"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:trace="http://www.eclipse.org/cbmc/debug/trace">
	<xsl:output method="xml" indent="yes" />

	<xsl:template name="getValueExpression">
		<xsl:param name="node" select="." />
		<xsl:param name="type" select="''" />
		<xsl:choose>
			<xsl:when test="$node/struct">
				<value xsi:type="trace:StructValue" type="{$type}">
					<xsl:for-each select="$node/struct/member">
						<values>
							<key>
								<xsl:value-of select="./@name" />
							</key>
							<xsl:call-template name="getValueExpression">
								<xsl:with-param name="node" select="." />
							</xsl:call-template>
						</values>
					</xsl:for-each>
				</value>
			</xsl:when>
			<xsl:when test="$node/union">
				<value xsi:type="trace:UnionValue" type="{$type}">
					<xsl:for-each select="$node/union/member">
						<values>
							<key>
								<xsl:value-of select="./@member_name" />
							</key>
							<xsl:call-template name="getValueExpression">
								<xsl:with-param name="node" select="." />
							</xsl:call-template>
						</values>
					</xsl:for-each>
				</value>
			</xsl:when>
			<xsl:when test="$node/array">
				<value xsi:type="trace:ArrayValue" type="{$type}">
					<xsl:for-each select="$node/array/element">
						<xsl:call-template name="getValueExpression">
							<xsl:with-param name="node" select="." />
						</xsl:call-template>
					</xsl:for-each>
				</value>
			</xsl:when>
			<xsl:otherwise>
				<xsl:choose>
					<xsl:when test="name($node) = 'element'">
						<values xsi:type="trace:SimpleValue" value="{$node/*[1]}" type="{$node/*[1]/@c_type}"/>
					</xsl:when>
					<xsl:otherwise>
						<value xsi:type="trace:SimpleValue" value="{$node/*[1]}" type="{$node/*[1]/@c_type}"/>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="/">
		<trace:Trace>
			<xsl:for-each select="/cprover/goto_trace/*">
				<xsl:if
					test="name() = 'assignment' and not(contains(@base_name,'__CPROVER'))">
					<steps xsi:type="trace:Assignment">
						<number>
							<xsl:value-of select="@step_nr" />
						</number>
						<xsl:if test="./location">
							<location>
								<file>
									<xsl:value-of select="location/@file" />
								</file>
								<function>
									<xsl:value-of select="location/@function" />
								</function>
								<line>
									<xsl:value-of select="location/@line" />
								</line>
							</location>
						</xsl:if>
						<thread>
							<xsl:value-of select="@thread" />
						</thread>
						<id>
							<xsl:value-of select="@identifier" />
						</id>
						<baseName>
							<xsl:value-of select="@base_name" />
						</baseName>
						<displayName>
							<xsl:value-of select="@display_name" />
						</displayName>
						<xsl:choose>
							<xsl:when
								test="./value_expression/struct or ./value_expression/array or ./value_expression/union">

								<xsl:call-template name="getValueExpression">
									<xsl:with-param name="node" select="./value_expression" />
									<xsl:with-param name="type" select="./type" />
								</xsl:call-template>
							</xsl:when>
							<xsl:otherwise>
								<value xsi:type="trace:SimpleValue" value="{./full_lhs_value}"
									type="{./type}">
								</value>
							</xsl:otherwise>
						</xsl:choose>
					</steps>
				</xsl:if>
				<xsl:if
					test="name() = 'function_call' and not(contains(./function/@display_name,'__CPROVER'))">
					<steps xsi:type="trace:FunctionCall">
						<thread>
							<xsl:value-of select="@thread" />
						</thread>
						<number>
							<xsl:value-of select="@step_nr" />
						</number>

<!-- 						<xsl:if test="./location"> -->
<!-- 							<location> -->
<!-- 								<file> -->
<!-- 									<xsl:value-of select="location/@file" /> -->
<!-- 								</file> -->
<!-- 								<function> -->
<!-- 									<xsl:value-of select="location/@function" /> -->
<!-- 								</function> -->
<!-- 								<line> -->
<!-- 									<xsl:value-of select="location/@line" /> -->
<!-- 								</line> -->
<!-- 							</location> -->
<!-- 						</xsl:if> -->
						<xsl:if test="./function">
							<id>
								<xsl:value-of select="function/@identifier" />
							</id>
							<displayName>
								<xsl:value-of select="function/@display_name" />
							</displayName>
						</xsl:if>
						<xsl:if test="./function/location">
							<location>
								<file>
									<xsl:value-of select="function/location/@file" />
								</file>
								<line>
									<xsl:value-of select="function/location/@line" />
								</line>
								<function>
									<xsl:value-of select="function/@display_name" />
								</function>
							</location>
						</xsl:if>
					</steps>
				</xsl:if>
				<xsl:if
					test="name() = 'function_return' and not(contains(./function/@display_name,'__CPROVER'))">
					<steps xsi:type="trace:FunctionReturn">
						<thread>
							<xsl:value-of select="@thread" />
						</thread>
						<number>
							<xsl:value-of select="@step_nr" />
						</number>
						<xsl:if test="./function">
							<id>
								<xsl:value-of select="function/@identifier" />
							</id>
							<displayName>
								<xsl:value-of select="function/@display_name" />
							</displayName>
							<xsl:if test="./function/location">
							</xsl:if>
						</xsl:if>
						<xsl:if test="./location">
							<location>
								<file>
									<xsl:value-of select="location/@file" />
								</file>
								<function>
									<xsl:value-of select="location/@function" />
								</function>
								<line>
									<xsl:value-of select="location/@line" />
								</line>
							</location>
						</xsl:if>
					</steps>
				</xsl:if>
				<xsl:if test="name() = 'failure'">
					<steps xsi:type="trace:Failure">
						<thread>
							<xsl:value-of select="@thread" />
						</thread>
						<number>
							<xsl:value-of select="@step_nr" />
						</number>
						<reason>
							<xsl:value-of select="@reason" />
						</reason>
						<xsl:if test="./location">
							<location>
								<file>
									<xsl:value-of select="location/@file" />
								</file>
								<function>
									<xsl:value-of select="location/@function" />
								</function>
								<line>
									<xsl:value-of select="location/@line" />
								</line>
							</location>
						</xsl:if>
					</steps>
				</xsl:if>
				<xsl:if test="name() = 'location-only'">
					<steps xsi:type="trace:LocationOnly">
						<thread>
							<xsl:value-of select="@thread" />
						</thread>
						<number>
							<xsl:value-of select="@step_nr" />
						</number>
						<xsl:if test="./location">
							<location>
								<file>
									<xsl:value-of select="location/@file" />
								</file>
								<function>
									<xsl:value-of select="location/@function" />
								</function>
								<line>
									<xsl:value-of select="location/@line" />
								</line>
							</location>
						</xsl:if>
					</steps>
				</xsl:if>
				<xsl:if test="name() = 'output'">
					<steps xsi:type="trace:Output">
						<thread>
							<xsl:value-of select="@thread" />
						</thread>
						<number>
							<xsl:value-of select="@step_nr" />
						</number>
						<text>
							<xsl:value-of select="@text" />
						</text>
						<xsl:if test="./location">
							<location>
								<file>
									<xsl:value-of select="location/@file" />
								</file>
								<function>
									<xsl:value-of select="location/@function" />
								</function>
								<line>
									<xsl:value-of select="location/@line" />
								</line>
							</location>
						</xsl:if>
					</steps>
				</xsl:if>
			</xsl:for-each>
		</trace:Trace>
	</xsl:template>
</xsl:stylesheet>