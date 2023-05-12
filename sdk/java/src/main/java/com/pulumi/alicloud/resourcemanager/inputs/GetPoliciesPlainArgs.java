// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPoliciesPlainArgs Empty = new GetPoliciesPlainArgs();

    /**
     * A list of Resource Manager Policy IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Resource Manager Policy IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by policy name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by policy name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     * 
     */
    @Import(name="policyType")
    private @Nullable String policyType;

    /**
     * @return The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
     * 
     */
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private GetPoliciesPlainArgs() {}

    private GetPoliciesPlainArgs(GetPoliciesPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPoliciesPlainArgs $;

        public Builder() {
            $ = new GetPoliciesPlainArgs();
        }

        public Builder(GetPoliciesPlainArgs defaults) {
            $ = new GetPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Resource Manager Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Resource Manager Policy IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by policy name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param policyType The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values: `Custom` and `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable String policyType) {
            $.policyType = policyType;
            return this;
        }

        public GetPoliciesPlainArgs build() {
            return $;
        }
    }

}
