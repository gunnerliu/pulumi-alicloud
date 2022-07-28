// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The Description of the group. The description can be up to `1024` characters long.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description of the group. The description can be up to `1024` characters long.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the Directory.
     * 
     */
    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    /**
     * @return The ID of the Directory.
     * 
     */
    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    /**
     * The GroupId of the group.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The GroupId of the group.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The Name of the group. The name must be `1` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return The Name of the group. The name must be `1` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.description = $.description;
        this.directoryId = $.directoryId;
        this.groupId = $.groupId;
        this.groupName = $.groupName;
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
         * @param description The Description of the group. The description can be up to `1024` characters long.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description of the group. The description can be up to `1024` characters long.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param groupId The GroupId of the group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The GroupId of the group.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupName The Name of the group. The name must be `1` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName The Name of the group. The name must be `1` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public GroupState build() {
            return $;
        }
    }

}
