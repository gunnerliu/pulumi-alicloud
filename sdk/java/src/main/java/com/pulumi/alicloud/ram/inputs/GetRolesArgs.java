// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolesArgs Empty = new GetRolesArgs();

    /**
     * - A list of ram role IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return - A list of ram role IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by the role name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by the role name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    /**
     * @return Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
     * 
     */
    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private GetRolesArgs() {}

    private GetRolesArgs(GetRolesArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolesArgs $;

        public Builder() {
            $ = new GetRolesArgs();
        }

        public Builder(GetRolesArgs defaults) {
            $ = new GetRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids - A list of ram role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids - A list of ram role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids - A list of ram role IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by the role name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by the role name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param policyName Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Filter results by a specific policy name. If you set this parameter without setting `policy_type`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policyType Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policy_name` as well.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public GetRolesArgs build() {
            return $;
        }
    }

}
