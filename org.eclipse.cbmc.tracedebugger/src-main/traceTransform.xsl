<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	extension-element-prefixes="exsl" xmlns:exsl="http://exslt.org/common">
	<xsl:output method="xml" indent="yes" />
	<xsl:template match="/">
		<trace:Trace xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns:trace="http://www.eclipse.org/cbmc/debug/trace">
			<xsl:for-each select="/cprover/goto_trace/*">
			
				<xsl:if test="name() = 'assignment' and not(contains(@base_name,'__CPROVER'))">
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
						<value>
							<xsl:value-of select="value" />
						</value>
						<type>
							<xsl:value-of select="type" />
						</type>
						
					</steps>
				</xsl:if>
				<xsl:if test="name() = 'function_call' and not(contains(./function/@display_name,'__CPROVER'))">
					<steps xsi:type="trace:FunctionCall">
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
						<xsl:if test="./function">
							<id>
								<xsl:value-of select="function/@identifier" />
							</id>
							<displayName>
								<xsl:value-of select="function/@display_name" />
							</displayName>
							<xsl:if test="./function/location">
								<functionLocation>
									<file>
										<xsl:value-of select="function/location/@file" />
								</file>
									<line>
										<xsl:value-of select="function/location/@line" />
									</line>
								</functionLocation>
							</xsl:if>
						</xsl:if>
					</steps>
				</xsl:if>
				<xsl:if test="name() = 'function_return' and not(contains(./function/@display_name,'__CPROVER'))">
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
								<functionLocation>
									<file>
										<xsl:value-of select="function/location/@file" />
									</file>
									<line>
										<xsl:value-of select="function/location/@line" />
									</line>
								</functionLocation>
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
								<line>
									<xsl:value-of select="location/@line" />
								</line>
								<function>
									<xsl:value-of select="location/@function" />
								</function>
							</location>
						</xsl:if>
					</steps>
				</xsl:if>
			</xsl:for-each>
		</trace:Trace>
	</xsl:template>
</xsl:stylesheet>