// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * Sensitive Data Identification Rules for the Type of. Valid values:
     * 
     */
    @Import(name="category", required=true)
    private Output<Integer> category;

    /**
     * @return Sensitive Data Identification Rules for the Type of. Valid values:
     * 
     */
    public Output<Integer> category() {
        return this.category;
    }

    /**
     * Sensitive Data Identification Rules the Content.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return Sensitive Data Identification Rules the Content.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The Content Classification.
     * 
     */
    @Import(name="contentCategory")
    private @Nullable Output<String> contentCategory;

    /**
     * @return The Content Classification.
     * 
     */
    public Optional<Output<String>> contentCategory() {
        return Optional.ofNullable(this.contentCategory);
    }

    /**
     * Sensitive Data Identification Rules of Type. Valid values:
     * 
     */
    @Import(name="customType")
    private @Nullable Output<Integer> customType;

    /**
     * @return Sensitive Data Identification Rules of Type. Valid values:
     * 
     */
    public Optional<Output<Integer>> customType() {
        return Optional.ofNullable(this.customType);
    }

    /**
     * Sensitive Data Identification a Description of the Rule Information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Sensitive Data Identification a Description of the Rule Information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Request and Receive the Language of the Message Type. Valid values:
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The Request and Receive the Language of the Message Type. Valid values:
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
     * 
     */
    @Import(name="productCode")
    private @Nullable Output<String> productCode;

    /**
     * @return Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
     * 
     */
    public Optional<Output<String>> productCode() {
        return Optional.ofNullable(this.productCode);
    }

    /**
     * Product ID. Valid values:
     * 
     */
    @Import(name="productId")
    private @Nullable Output<String> productId;

    /**
     * @return Product ID. Valid values:
     * 
     */
    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * Sensitive Data Identification Rules of Risk Level ID. Valid values:
     * 
     */
    @Import(name="riskLevelId")
    private @Nullable Output<String> riskLevelId;

    /**
     * @return Sensitive Data Identification Rules of Risk Level ID. Valid values:
     * 
     */
    public Optional<Output<String>> riskLevelId() {
        return Optional.ofNullable(this.riskLevelId);
    }

    /**
     * Sensitive Data Identification Name of the Rule.
     * 
     */
    @Import(name="ruleName", required=true)
    private Output<String> ruleName;

    /**
     * @return Sensitive Data Identification Name of the Rule.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    /**
     * Rule Type.
     * 
     */
    @Import(name="ruleType")
    private @Nullable Output<Integer> ruleType;

    /**
     * @return Rule Type.
     * 
     */
    public Optional<Output<Integer>> ruleType() {
        return Optional.ofNullable(this.ruleType);
    }

    /**
     * Triggered the Alarm Conditions.
     * 
     */
    @Import(name="statExpress")
    private @Nullable Output<String> statExpress;

    /**
     * @return Triggered the Alarm Conditions.
     * 
     */
    public Optional<Output<String>> statExpress() {
        return Optional.ofNullable(this.statExpress);
    }

    /**
     * Sensitive Data Identification Rules Detection State of.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return Sensitive Data Identification Rules Detection State of.
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The Target of rule.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The Target of rule.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * The Level of Risk. Valid values:
     * 
     */
    @Import(name="warnLevel")
    private @Nullable Output<Integer> warnLevel;

    /**
     * @return The Level of Risk. Valid values:
     * 
     */
    public Optional<Output<Integer>> warnLevel() {
        return Optional.ofNullable(this.warnLevel);
    }

    private RuleArgs() {}

    private RuleArgs(RuleArgs $) {
        this.category = $.category;
        this.content = $.content;
        this.contentCategory = $.contentCategory;
        this.customType = $.customType;
        this.description = $.description;
        this.lang = $.lang;
        this.productCode = $.productCode;
        this.productId = $.productId;
        this.riskLevelId = $.riskLevelId;
        this.ruleName = $.ruleName;
        this.ruleType = $.ruleType;
        this.statExpress = $.statExpress;
        this.status = $.status;
        this.target = $.target;
        this.warnLevel = $.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleArgs $;

        public Builder() {
            $ = new RuleArgs();
        }

        public Builder(RuleArgs defaults) {
            $ = new RuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Sensitive Data Identification Rules for the Type of. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder category(Output<Integer> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Sensitive Data Identification Rules for the Type of. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder category(Integer category) {
            return category(Output.of(category));
        }

        /**
         * @param content Sensitive Data Identification Rules the Content.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Sensitive Data Identification Rules the Content.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param contentCategory The Content Classification.
         * 
         * @return builder
         * 
         */
        public Builder contentCategory(@Nullable Output<String> contentCategory) {
            $.contentCategory = contentCategory;
            return this;
        }

        /**
         * @param contentCategory The Content Classification.
         * 
         * @return builder
         * 
         */
        public Builder contentCategory(String contentCategory) {
            return contentCategory(Output.of(contentCategory));
        }

        /**
         * @param customType Sensitive Data Identification Rules of Type. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder customType(@Nullable Output<Integer> customType) {
            $.customType = customType;
            return this;
        }

        /**
         * @param customType Sensitive Data Identification Rules of Type. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder customType(Integer customType) {
            return customType(Output.of(customType));
        }

        /**
         * @param description Sensitive Data Identification a Description of the Rule Information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Sensitive Data Identification a Description of the Rule Information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lang The Request and Receive the Language of the Message Type. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The Request and Receive the Language of the Message Type. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param productCode Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
         * 
         * @return builder
         * 
         */
        public Builder productCode(@Nullable Output<String> productCode) {
            $.productCode = productCode;
            return this;
        }

        /**
         * @param productCode Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
         * 
         * @return builder
         * 
         */
        public Builder productCode(String productCode) {
            return productCode(Output.of(productCode));
        }

        /**
         * @param productId Product ID. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId Product ID. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param riskLevelId Sensitive Data Identification Rules of Risk Level ID. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder riskLevelId(@Nullable Output<String> riskLevelId) {
            $.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * @param riskLevelId Sensitive Data Identification Rules of Risk Level ID. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder riskLevelId(String riskLevelId) {
            return riskLevelId(Output.of(riskLevelId));
        }

        /**
         * @param ruleName Sensitive Data Identification Name of the Rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Sensitive Data Identification Name of the Rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param ruleType Rule Type.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(@Nullable Output<Integer> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType Rule Type.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(Integer ruleType) {
            return ruleType(Output.of(ruleType));
        }

        /**
         * @param statExpress Triggered the Alarm Conditions.
         * 
         * @return builder
         * 
         */
        public Builder statExpress(@Nullable Output<String> statExpress) {
            $.statExpress = statExpress;
            return this;
        }

        /**
         * @param statExpress Triggered the Alarm Conditions.
         * 
         * @return builder
         * 
         */
        public Builder statExpress(String statExpress) {
            return statExpress(Output.of(statExpress));
        }

        /**
         * @param status Sensitive Data Identification Rules Detection State of.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Sensitive Data Identification Rules Detection State of.
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        /**
         * @param target The Target of rule.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The Target of rule.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param warnLevel The Level of Risk. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder warnLevel(@Nullable Output<Integer> warnLevel) {
            $.warnLevel = warnLevel;
            return this;
        }

        /**
         * @param warnLevel The Level of Risk. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder warnLevel(Integer warnLevel) {
            return warnLevel(Output.of(warnLevel));
        }

        public RuleArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.ruleName = Objects.requireNonNull($.ruleName, "expected parameter 'ruleName' to be non-null");
            return $;
        }
    }

}
