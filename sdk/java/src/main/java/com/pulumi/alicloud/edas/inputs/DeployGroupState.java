// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeployGroupState extends com.pulumi.resources.ResourceArgs {

    public static final DeployGroupState Empty = new DeployGroupState();

    /**
     * The ID of the application that you want to deploy.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The ID of the application that you want to deploy.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The name of the instance group that you want to create.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return The name of the instance group that you want to create.
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
     * 
     */
    @Import(name="groupType")
    private @Nullable Output<Integer> groupType;

    /**
     * @return The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
     * 
     */
    public Optional<Output<Integer>> groupType() {
        return Optional.ofNullable(this.groupType);
    }

    private DeployGroupState() {}

    private DeployGroupState(DeployGroupState $) {
        this.appId = $.appId;
        this.groupName = $.groupName;
        this.groupType = $.groupType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployGroupState $;

        public Builder() {
            $ = new DeployGroupState();
        }

        public Builder(DeployGroupState defaults) {
            $ = new DeployGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of the application that you want to deploy.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ID of the application that you want to deploy.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param groupName The name of the instance group that you want to create.
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName The name of the instance group that you want to create.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param groupType The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
         * 
         * @return builder
         * 
         */
        public Builder groupType(@Nullable Output<Integer> groupType) {
            $.groupType = groupType;
            return this;
        }

        /**
         * @param groupType The type of the instance group that you want to create. Valid values: 0: Default group. 1: Phased release is disabled for traffic management. 2: Phased release is enabled for traffic management.
         * 
         * @return builder
         * 
         */
        public Builder groupType(Integer groupType) {
            return groupType(Output.of(groupType));
        }

        public DeployGroupState build() {
            return $;
        }
    }

}
