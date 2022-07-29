// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    /**
     * Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     * - PostgreSQL: [ KOI8U、UTF8、WIN866、WIN874、WIN1250、WIN1251、WIN1252、WIN1253、WIN1254、WIN1255、WIN1256、WIN1257、WIN1258、EUC_CN、EUC_KR、EUC_TW、EUC_JP、EUC_JIS_2004、KOI8R、MULE_INTERNAL、LATIN1、LATIN2、LATIN3、LATIN4、LATIN5、LATIN6、LATIN7、LATIN8、LATIN9、LATIN10、ISO_8859_5、ISO_8859_6、ISO_8859_7、ISO_8859_8、SQL_ASCII ]
     * 
     */
    @Import(name="characterSet")
    private @Nullable Output<String> characterSet;

    /**
     * @return Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     * - PostgreSQL: [ KOI8U、UTF8、WIN866、WIN874、WIN1250、WIN1251、WIN1252、WIN1253、WIN1254、WIN1255、WIN1256、WIN1257、WIN1258、EUC_CN、EUC_KR、EUC_TW、EUC_JP、EUC_JIS_2004、KOI8R、MULE_INTERNAL、LATIN1、LATIN2、LATIN3、LATIN4、LATIN5、LATIN6、LATIN7、LATIN8、LATIN9、LATIN10、ISO_8859_5、ISO_8859_6、ISO_8859_7、ISO_8859_8、SQL_ASCII ]
     * 
     */
    public Optional<Output<String>> characterSet() {
        return Optional.ofNullable(this.characterSet);
    }

    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Id of instance that can run database.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The Id of instance that can run database.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
     * and have no more than 64 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
     * and have no more than 64 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DatabaseState() {}

    private DatabaseState(DatabaseState $) {
        this.characterSet = $.characterSet;
        this.description = $.description;
        this.instanceId = $.instanceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseState $;

        public Builder() {
            $ = new DatabaseState();
        }

        public Builder(DatabaseState defaults) {
            $ = new DatabaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param characterSet Character set. The value range is limited to the following:
         * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
         * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
         * - PostgreSQL: [ KOI8U、UTF8、WIN866、WIN874、WIN1250、WIN1251、WIN1252、WIN1253、WIN1254、WIN1255、WIN1256、WIN1257、WIN1258、EUC_CN、EUC_KR、EUC_TW、EUC_JP、EUC_JIS_2004、KOI8R、MULE_INTERNAL、LATIN1、LATIN2、LATIN3、LATIN4、LATIN5、LATIN6、LATIN7、LATIN8、LATIN9、LATIN10、ISO_8859_5、ISO_8859_6、ISO_8859_7、ISO_8859_8、SQL_ASCII ]
         * 
         * @return builder
         * 
         */
        public Builder characterSet(@Nullable Output<String> characterSet) {
            $.characterSet = characterSet;
            return this;
        }

        /**
         * @param characterSet Character set. The value range is limited to the following:
         * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
         * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
         * - PostgreSQL: [ KOI8U、UTF8、WIN866、WIN874、WIN1250、WIN1251、WIN1252、WIN1253、WIN1254、WIN1255、WIN1256、WIN1257、WIN1258、EUC_CN、EUC_KR、EUC_TW、EUC_JP、EUC_JIS_2004、KOI8R、MULE_INTERNAL、LATIN1、LATIN2、LATIN3、LATIN4、LATIN5、LATIN6、LATIN7、LATIN8、LATIN9、LATIN10、ISO_8859_5、ISO_8859_6、ISO_8859_7、ISO_8859_8、SQL_ASCII ]
         * 
         * @return builder
         * 
         */
        public Builder characterSet(String characterSet) {
            return characterSet(Output.of(characterSet));
        }

        /**
         * @param description Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceId The Id of instance that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The Id of instance that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
         * and have no more than 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letter
         * and have no more than 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DatabaseState build() {
            return $;
        }
    }

}
