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
	<xsl:key name="kUniqueCategory" match="property" use="@class" />
	<xsl:variable name="categories">
		<xsl:for-each
			select="//property[
              generate-id() = generate-id(key('kUniqueCategory', @class)[1])
               ]">
			<categories>
				<name>
					<xsl:value-of select="@class" />
				</name>
			</categories>
		</xsl:for-each>
	</xsl:variable>

	<xsl:key name="kUniqueFile" match="location" use="@file" />
	<xsl:variable name="files">
		<xsl:for-each
			select="//location[
              generate-id() = generate-id(key('kUniqueFile', @file)[1])
               ]">
			<files>

				<name>
					<xsl:value-of select="@file" />
				</name>
			</files>
		</xsl:for-each>
	</xsl:variable>

	<xsl:template match="/">
		<cbmc:Results xmlns:cbmc="http://www.eclipse.org/cbmc">
			<failedCount>0</failedCount>
			<errorCount>0</errorCount>
			<succeededCount>0</succeededCount>
			<loopResults>
			<errorMessage></errorMessage>
			</loopResults>
			<xsl:copy-of select="$categories" />
			<xsl:copy-of select="$files" />
			<errorMessage>
				<xsl:for-each select="/cprover/message[@type='ERROR']">
					<xsl:value-of select="text" />
				</xsl:for-each>
			</errorMessage>
			<xsl:for-each select="/cprover/property">
				<xsl:variable name="category" select="@class" />
				<xsl:variable name="file" select="./location/@file" />
				<properties>
					<xsl:for-each select="exsl:node-set($categories)/*">
						<xsl:if test=".=$category">
							<category>
								<xsl:value-of select="concat('#//@categories.', position()-1)" />
							</category>
						</xsl:if>
					</xsl:for-each>
					<description>
						<xsl:value-of select="description" />
					</description>
					<xsl:for-each select="exsl:node-set($files)/*">
						<xsl:if test=".=$file">
							<file>
								<xsl:value-of select="concat('#//@files.', position()-1)" />
							</file>
						</xsl:if>
					</xsl:for-each>
					<function>
						<xsl:value-of select="location/@function" />
					</function>
					<line>
						<xsl:value-of select="location/@line" />
					</line>
					<number>
						<xsl:value-of select="@name" />
					</number>
					<detailsFile></detailsFile>
					<status>pending</status>
				</properties>
			</xsl:for-each>

		</cbmc:Results>
	</xsl:template>

</xsl:stylesheet>