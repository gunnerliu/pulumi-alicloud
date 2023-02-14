// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchBaselineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchBaselineArgs Empty = new PatchBaselineArgs();

    /**
     * Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
     * 
     */
    @Import(name="approvalRules", required=true)
    private Output<String> approvalRules;

    /**
     * @return Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
     * 
     */
    public Output<String> approvalRules() {
        return this.approvalRules;
    }

    /**
     * Patches baseline description information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Patches baseline description information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`.
     * 
     */
    @Import(name="operationSystem", required=true)
    private Output<String> operationSystem;

    /**
     * @return Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`.
     * 
     */
    public Output<String> operationSystem() {
        return this.operationSystem;
    }

    /**
     * The name of the patch baseline.
     * 
     */
    @Import(name="patchBaselineName", required=true)
    private Output<String> patchBaselineName;

    /**
     * @return The name of the patch baseline.
     * 
     */
    public Output<String> patchBaselineName() {
        return this.patchBaselineName;
    }

    private PatchBaselineArgs() {}

    private PatchBaselineArgs(PatchBaselineArgs $) {
        this.approvalRules = $.approvalRules;
        this.description = $.description;
        this.operationSystem = $.operationSystem;
        this.patchBaselineName = $.patchBaselineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchBaselineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchBaselineArgs $;

        public Builder() {
            $ = new PatchBaselineArgs();
        }

        public Builder(PatchBaselineArgs defaults) {
            $ = new PatchBaselineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param approvalRules Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
         * 
         * @return builder
         * 
         */
        public Builder approvalRules(Output<String> approvalRules) {
            $.approvalRules = approvalRules;
            return this;
        }

        /**
         * @param approvalRules Accept the rules. This value follows the json format. For more details, see the [description of ApprovalRules in the Request parameters table for details](https://www.alibabacloud.com/help/zh/doc-detail/311002.html).
         * 
         * @return builder
         * 
         */
        public Builder approvalRules(String approvalRules) {
            return approvalRules(Output.of(approvalRules));
        }

        /**
         * @param description Patches baseline description information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Patches baseline description information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param operationSystem Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`.
         * 
         * @return builder
         * 
         */
        public Builder operationSystem(Output<String> operationSystem) {
            $.operationSystem = operationSystem;
            return this;
        }

        /**
         * @param operationSystem Operating system type. Valid values: `AliyunLinux`, `Anolis`, `CentOS`, `Debian`, `RedhatEnterpriseLinux`, `Ubuntu`, `Windows`.
         * 
         * @return builder
         * 
         */
        public Builder operationSystem(String operationSystem) {
            return operationSystem(Output.of(operationSystem));
        }

        /**
         * @param patchBaselineName The name of the patch baseline.
         * 
         * @return builder
         * 
         */
        public Builder patchBaselineName(Output<String> patchBaselineName) {
            $.patchBaselineName = patchBaselineName;
            return this;
        }

        /**
         * @param patchBaselineName The name of the patch baseline.
         * 
         * @return builder
         * 
         */
        public Builder patchBaselineName(String patchBaselineName) {
            return patchBaselineName(Output.of(patchBaselineName));
        }

        public PatchBaselineArgs build() {
            $.approvalRules = Objects.requireNonNull($.approvalRules, "expected parameter 'approvalRules' to be non-null");
            $.operationSystem = Objects.requireNonNull($.operationSystem, "expected parameter 'operationSystem' to be non-null");
            $.patchBaselineName = Objects.requireNonNull($.patchBaselineName, "expected parameter 'patchBaselineName' to be non-null");
            return $;
        }
    }

}