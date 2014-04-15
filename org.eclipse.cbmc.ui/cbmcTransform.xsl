<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	extension-element-prefixes="exsl" xmlns:exsl="http://exslt.org/common">
	<xsl:output method="xml" indent="yes" />
	<xsl:key name="kUniqueCategory" match="property" use="." />
	<xsl:variable name="categories">

		<xsl:for-each
			select="//property[
              generate-id() = generate-id(key('kUniqueCategory', .)[1])
               ]">
			<categories>
				<name>
					<xsl:value-of select="." />
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
			<xsl:copy-of select="$categories" />
			<xsl:copy-of select="$files" />
			<xsl:for-each select="/cprover/claim">
				<xsl:variable name="property" select="./property" />
				<xsl:variable name="file" select="./location/file/text()" />
				<properties>
					<xsl:for-each select="exsl:node-set($categories)/*">
						<xsl:if test=".=$property">
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
						<xsl:value-of select="location/function" />
					</function>
					<line>
						<xsl:value-of select="location/line" />
					</line>
					<number>
						<xsl:value-of select="number" />
					</number>
					<detailsFile></detailsFile>
					<status>pending</status>
				</properties>
			</xsl:for-each>

		</cbmc:Results>
	</xsl:template>

</xsl:stylesheet>