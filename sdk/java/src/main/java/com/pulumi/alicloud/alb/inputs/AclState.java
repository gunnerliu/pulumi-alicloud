// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.alicloud.alb.inputs.AclAclEntryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclState extends com.pulumi.resources.ResourceArgs {

    public static final AclState Empty = new AclState();

    /**
     * The list of the ACL entries. You can add up to `20` entries in each call.  **NOTE:** &#34;Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.&#34;,
     * 
     * @deprecated
     * Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.
     * 
     */
    @Deprecated /* Field 'acl_entries' has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_acl_entry_attachment'. */
    @Import(name="aclEntries")
    private @Nullable Output<List<AclAclEntryArgs>> aclEntries;

    /**
     * @return The list of the ACL entries. You can add up to `20` entries in each call.  **NOTE:** &#34;Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.&#34;,
     * 
     * @deprecated
     * Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.
     * 
     */
    @Deprecated /* Field 'acl_entries' has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_acl_entry_attachment'. */
    public Optional<Output<List<AclAclEntryArgs>>> aclEntries() {
        return Optional.ofNullable(this.aclEntries);
    }

    /**
     * The name of the ACL. The name must be `2` to `128` characters in length, and can contain letters, digits, hyphens (-) and underscores (_). It must start with a letter.
     * 
     */
    @Import(name="aclName")
    private @Nullable Output<String> aclName;

    /**
     * @return The name of the ACL. The name must be `2` to `128` characters in length, and can contain letters, digits, hyphens (-) and underscores (_). It must start with a letter.
     * 
     */
    public Optional<Output<String>> aclName() {
        return Optional.ofNullable(this.aclName);
    }

    /**
     * Specifies whether to precheck the API request.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck the API request.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The state of the ACL. Valid values:`Provisioning`, `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The state of the ACL. Valid values:`Provisioning`, `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AclState() {}

    private AclState(AclState $) {
        this.aclEntries = $.aclEntries;
        this.aclName = $.aclName;
        this.dryRun = $.dryRun;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclState $;

        public Builder() {
            $ = new AclState();
        }

        public Builder(AclState defaults) {
            $ = new AclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclEntries The list of the ACL entries. You can add up to `20` entries in each call.  **NOTE:** &#34;Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.&#34;,
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.
         * 
         */
        @Deprecated /* Field 'acl_entries' has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_acl_entry_attachment'. */
        public Builder aclEntries(@Nullable Output<List<AclAclEntryArgs>> aclEntries) {
            $.aclEntries = aclEntries;
            return this;
        }

        /**
         * @param aclEntries The list of the ACL entries. You can add up to `20` entries in each call.  **NOTE:** &#34;Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.&#34;,
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.
         * 
         */
        @Deprecated /* Field 'acl_entries' has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_acl_entry_attachment'. */
        public Builder aclEntries(List<AclAclEntryArgs> aclEntries) {
            return aclEntries(Output.of(aclEntries));
        }

        /**
         * @param aclEntries The list of the ACL entries. You can add up to `20` entries in each call.  **NOTE:** &#34;Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.&#34;,
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;acl_entries&#39; has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_alb_acl_entry_attachment&#39;.
         * 
         */
        @Deprecated /* Field 'acl_entries' has been deprecated from provider version 1.166.0 and it will be removed in the future version. Please use the new resource 'alicloud_alb_acl_entry_attachment'. */
        public Builder aclEntries(AclAclEntryArgs... aclEntries) {
            return aclEntries(List.of(aclEntries));
        }

        /**
         * @param aclName The name of the ACL. The name must be `2` to `128` characters in length, and can contain letters, digits, hyphens (-) and underscores (_). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder aclName(@Nullable Output<String> aclName) {
            $.aclName = aclName;
            return this;
        }

        /**
         * @param aclName The name of the ACL. The name must be `2` to `128` characters in length, and can contain letters, digits, hyphens (-) and underscores (_). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder aclName(String aclName) {
            return aclName(Output.of(aclName));
        }

        /**
         * @param dryRun Specifies whether to precheck the API request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to precheck the API request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status The state of the ACL. Valid values:`Provisioning`, `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The state of the ACL. Valid values:`Provisioning`, `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public AclState build() {
            return $;
        }
    }

}