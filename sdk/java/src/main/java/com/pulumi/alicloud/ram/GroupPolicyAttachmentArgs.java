// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GroupPolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentArgs Empty = new GroupPolicyAttachmentArgs();

    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="groupName", required=true)
    private Output<String> groupName;

    /**
     * @return Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }

    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     * 
     */
    @Import(name="policyType", required=true)
    private Output<String> policyType;

    /**
     * @return Type of the RAM policy. It must be `Custom` or `System`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }

    private GroupPolicyAttachmentArgs() {}

    private GroupPolicyAttachmentArgs(GroupPolicyAttachmentArgs $) {
        this.groupName = $.groupName;
        this.policyName = $.policyName;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyAttachmentArgs $;

        public Builder() {
            $ = new GroupPolicyAttachmentArgs();
        }

        public Builder(GroupPolicyAttachmentArgs defaults) {
            $ = new GroupPolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupName Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder groupName(Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param policyName Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param policyType Type of the RAM policy. It must be `Custom` or `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType Type of the RAM policy. It must be `Custom` or `System`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public GroupPolicyAttachmentArgs build() {
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.policyType = Objects.requireNonNull($.policyType, "expected parameter 'policyType' to be non-null");
            return $;
        }
    }

}
