<!--
    Copyright (c) 2014 Rapicorp, Inc and others.
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the Eclipse Public License v1.0
    which accompanies this distribution, and is available at
    http://www.eclipse.org/legal/epl-v10.html
   
    Contributors:
        Rapicorp, Inc - initial API and implementation
 -->
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	extension-element-prefixes="exsl" xmlns:exsl="http://exslt.org/common">
	<xsl:output method="xml" indent="yes" />
	<xsl:template name="substring-after-last">
		<xsl:param name="string" />
		<xsl:param name="delimiter" />
		<xsl:choose>
			<xsl:when test="contains($string, $delimiter)">
				<xsl:call-template name="substring-after-last">
					<xsl:with-param name="string"
						select="substring-after($string, $delimiter)" />
					<xsl:with-param name="delimiter" select="$delimiter" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$string" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="/">
		<cbmc:Results xmlns:cbmc="http://www.eclipse.org/cbmc">
			<loopResults>
				<errorMessage>
					<xsl:for-each select="/cprover/message[@type='ERROR']">
						<xsl:value-of select="text" />
					</xsl:for-each>
				</errorMessage>
				<xsl:for-each select="/cprover/loop">
					<loops>
						<id>
							<xsl:value-of select="loop-id" />
						</id>
						<unwind></unwind>
						<path>
							<xsl:value-of select="location/@file" />
						</path>
						<filename>
							<xsl:call-template name="substring-after-last">
								<xsl:with-param name="string" select="location/@file" />
								<xsl:with-param name="delimiter" select="'/'" />
							</xsl:call-template>
						</filename>
						<function>
							<xsl:value-of select="location/@function" />
						</function>
						<line>
							<xsl:value-of select="location/@line" />
						</line>
					</loops>
				</xsl:for-each>
			</loopResults>
		</cbmc:Results>
	</xsl:template>
</xsl:stylesheet>