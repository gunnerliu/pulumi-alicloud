// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * Replaced by `group_name` after version 1.98.0.
     * 
     * @deprecated
     * Field &#39;group_id&#39; has been deprecated from version 1.98.0. Use &#39;group_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'group_id' has been deprecated from version 1.98.0. Use 'group_name' instead. */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Replaced by `group_name` after version 1.98.0.
     * 
     * @deprecated
     * Field &#39;group_id&#39; has been deprecated from version 1.98.0. Use &#39;group_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'group_id' has been deprecated from version 1.98.0. Use 'group_name' instead. */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Name of the group. Two groups on a single instance cannot have the same name. A `group_name` starts with &#34;GID_&#34; or &#34;GID-&#34;, and contains letters, numbers, hyphens (-), and underscores (_).
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return Name of the group. Two groups on a single instance cannot have the same name. A `group_name` starts with &#34;GID_&#34; or &#34;GID-&#34;, and contains letters, numbers, hyphens (-), and underscores (_).
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
     * 
     */
    @Import(name="groupType")
    private @Nullable Output<String> groupType;

    /**
     * @return Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
     * 
     */
    public Optional<Output<String>> groupType() {
        return Optional.ofNullable(this.groupType);
    }

    /**
     * ID of the ONS Instance that owns the groups.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return ID of the ONS Instance that owns the groups.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
     * 
     */
    @Import(name="readEnable")
    private @Nullable Output<Boolean> readEnable;

    /**
     * @return This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
     * 
     */
    public Optional<Output<Boolean>> readEnable() {
        return Optional.ofNullable(this.readEnable);
    }

    /**
     * This attribute is a concise description of group. The length cannot exceed 256.
     * 
     */
    @Import(name="remark")
    private @Nullable Output<String> remark;

    /**
     * @return This attribute is a concise description of group. The length cannot exceed 256.
     * 
     */
    public Optional<Output<String>> remark() {
        return Optional.ofNullable(this.remark);
    }

    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.groupId = $.groupId;
        this.groupName = $.groupName;
        this.groupType = $.groupType;
        this.instanceId = $.instanceId;
        this.readEnable = $.readEnable;
        this.remark = $.remark;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId Replaced by `group_name` after version 1.98.0.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;group_id&#39; has been deprecated from version 1.98.0. Use &#39;group_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'group_id' has been deprecated from version 1.98.0. Use 'group_name' instead. */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Replaced by `group_name` after version 1.98.0.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;group_id&#39; has been deprecated from version 1.98.0. Use &#39;group_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'group_id' has been deprecated from version 1.98.0. Use 'group_name' instead. */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupName Name of the group. Two groups on a single instance cannot have the same name. A `group_name` starts with &#34;GID_&#34; or &#34;GID-&#34;, and contains letters, numbers, hyphens (-), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName Name of the group. Two groups on a single instance cannot have the same name. A `group_name` starts with &#34;GID_&#34; or &#34;GID-&#34;, and contains letters, numbers, hyphens (-), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param groupType Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
         * 
         * @return builder
         * 
         */
        public Builder groupType(@Nullable Output<String> groupType) {
            $.groupType = groupType;
            return this;
        }

        /**
         * @param groupType Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
         * 
         * @return builder
         * 
         */
        public Builder groupType(String groupType) {
            return groupType(Output.of(groupType));
        }

        /**
         * @param instanceId ID of the ONS Instance that owns the groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the ONS Instance that owns the groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param readEnable This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
         * 
         * @return builder
         * 
         */
        public Builder readEnable(@Nullable Output<Boolean> readEnable) {
            $.readEnable = readEnable;
            return this;
        }

        /**
         * @param readEnable This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
         * 
         * @return builder
         * 
         */
        public Builder readEnable(Boolean readEnable) {
            return readEnable(Output.of(readEnable));
        }

        /**
         * @param remark This attribute is a concise description of group. The length cannot exceed 256.
         * 
         * @return builder
         * 
         */
        public Builder remark(@Nullable Output<String> remark) {
            $.remark = remark;
            return this;
        }

        /**
         * @param remark This attribute is a concise description of group. The length cannot exceed 256.
         * 
         * @return builder
         * 
         */
        public Builder remark(String remark) {
            return remark(Output.of(remark));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
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
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public GroupState build() {
            return $;
        }
    }

}
