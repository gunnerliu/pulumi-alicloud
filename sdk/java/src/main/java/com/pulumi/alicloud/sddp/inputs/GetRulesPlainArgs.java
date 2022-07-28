// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesPlainArgs Empty = new GetRulesPlainArgs();

    /**
     * Sensitive Data Identification Rules for the Type of.
     * 
     */
    @Import(name="category")
    private @Nullable Integer category;

    /**
     * @return Sensitive Data Identification Rules for the Type of.
     * 
     */
    public Optional<Integer> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The Content Classification.
     * 
     */
    @Import(name="contentCategory")
    private @Nullable String contentCategory;

    /**
     * @return The Content Classification.
     * 
     */
    public Optional<String> contentCategory() {
        return Optional.ofNullable(this.contentCategory);
    }

    /**
     * Sensitive Data Identification Rules of Type. 0: the Built-in 1: The User-Defined.
     * 
     */
    @Import(name="customType")
    private @Nullable Integer customType;

    /**
     * @return Sensitive Data Identification Rules of Type. 0: the Built-in 1: The User-Defined.
     * 
     */
    public Optional<Integer> customType() {
        return Optional.ofNullable(this.customType);
    }

    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Rule IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The name of rule.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of rule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A regex string to filter results by Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Product ID.
     * 
     */
    @Import(name="productId")
    private @Nullable String productId;

    /**
     * @return Product ID.
     * 
     */
    public Optional<String> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * Sensitive Data Identification Rules of Risk Level ID. Valid values:1:S1, Weak Risk Level. 2:S2, Medium Risk Level. 3:S3 High Risk Level. 4:S4, the Highest Risk Level.
     * 
     */
    @Import(name="riskLevelId")
    private @Nullable String riskLevelId;

    /**
     * @return Sensitive Data Identification Rules of Risk Level ID. Valid values:1:S1, Weak Risk Level. 2:S2, Medium Risk Level. 3:S3 High Risk Level. 4:S4, the Highest Risk Level.
     * 
     */
    public Optional<String> riskLevelId() {
        return Optional.ofNullable(this.riskLevelId);
    }

    /**
     * Rule Type.
     * 
     */
    @Import(name="ruleType")
    private @Nullable Integer ruleType;

    /**
     * @return Rule Type.
     * 
     */
    public Optional<Integer> ruleType() {
        return Optional.ofNullable(this.ruleType);
    }

    /**
     * Sensitive Data Identification Rules Detection State of.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Sensitive Data Identification Rules Detection State of.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The Level of Risk.
     * 
     */
    @Import(name="warnLevel")
    private @Nullable Integer warnLevel;

    /**
     * @return The Level of Risk.
     * 
     */
    public Optional<Integer> warnLevel() {
        return Optional.ofNullable(this.warnLevel);
    }

    private GetRulesPlainArgs() {}

    private GetRulesPlainArgs(GetRulesPlainArgs $) {
        this.category = $.category;
        this.contentCategory = $.contentCategory;
        this.customType = $.customType;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.name = $.name;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.productId = $.productId;
        this.riskLevelId = $.riskLevelId;
        this.ruleType = $.ruleType;
        this.status = $.status;
        this.warnLevel = $.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesPlainArgs $;

        public Builder() {
            $ = new GetRulesPlainArgs();
        }

        public Builder(GetRulesPlainArgs defaults) {
            $ = new GetRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Sensitive Data Identification Rules for the Type of.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Integer category) {
            $.category = category;
            return this;
        }

        /**
         * @param contentCategory The Content Classification.
         * 
         * @return builder
         * 
         */
        public Builder contentCategory(@Nullable String contentCategory) {
            $.contentCategory = contentCategory;
            return this;
        }

        /**
         * @param customType Sensitive Data Identification Rules of Type. 0: the Built-in 1: The User-Defined.
         * 
         * @return builder
         * 
         */
        public Builder customType(@Nullable Integer customType) {
            $.customType = customType;
            return this;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param name The name of rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param productId Product ID.
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable String productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param riskLevelId Sensitive Data Identification Rules of Risk Level ID. Valid values:1:S1, Weak Risk Level. 2:S2, Medium Risk Level. 3:S3 High Risk Level. 4:S4, the Highest Risk Level.
         * 
         * @return builder
         * 
         */
        public Builder riskLevelId(@Nullable String riskLevelId) {
            $.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * @param ruleType Rule Type.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(@Nullable Integer ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param status Sensitive Data Identification Rules Detection State of.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param warnLevel The Level of Risk.
         * 
         * @return builder
         * 
         */
        public Builder warnLevel(@Nullable Integer warnLevel) {
            $.warnLevel = warnLevel;
            return this;
        }

        public GetRulesPlainArgs build() {
            return $;
        }
    }

}
