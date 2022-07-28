// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.inputs;

import com.pulumi.alicloud.ess.inputs.ScalingGroupVServerGroupsVserverGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingGroupVServerGroupsState extends com.pulumi.resources.ResourceArgs {

    public static final ScalingGroupVServerGroupsState Empty = new ScalingGroupVServerGroupsState();

    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * ID of the scaling group.
     * 
     */
    @Import(name="scalingGroupId")
    private @Nullable Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group.
     * 
     */
    public Optional<Output<String>> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }

    /**
     * A list of vserver groups attached on scaling group. See Block vserver_group below for details.
     * 
     */
    @Import(name="vserverGroups")
    private @Nullable Output<List<ScalingGroupVServerGroupsVserverGroupArgs>> vserverGroups;

    /**
     * @return A list of vserver groups attached on scaling group. See Block vserver_group below for details.
     * 
     */
    public Optional<Output<List<ScalingGroupVServerGroupsVserverGroupArgs>>> vserverGroups() {
        return Optional.ofNullable(this.vserverGroups);
    }

    private ScalingGroupVServerGroupsState() {}

    private ScalingGroupVServerGroupsState(ScalingGroupVServerGroupsState $) {
        this.force = $.force;
        this.scalingGroupId = $.scalingGroupId;
        this.vserverGroups = $.vserverGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingGroupVServerGroupsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingGroupVServerGroupsState $;

        public Builder() {
            $ = new ScalingGroupVServerGroupsState();
        }

        public Builder(ScalingGroupVServerGroupsState defaults) {
            $ = new ScalingGroupVServerGroupsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param force If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param scalingGroupId ID of the scaling group.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(@Nullable Output<String> scalingGroupId) {
            $.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * @param scalingGroupId ID of the scaling group.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(String scalingGroupId) {
            return scalingGroupId(Output.of(scalingGroupId));
        }

        /**
         * @param vserverGroups A list of vserver groups attached on scaling group. See Block vserver_group below for details.
         * 
         * @return builder
         * 
         */
        public Builder vserverGroups(@Nullable Output<List<ScalingGroupVServerGroupsVserverGroupArgs>> vserverGroups) {
            $.vserverGroups = vserverGroups;
            return this;
        }

        /**
         * @param vserverGroups A list of vserver groups attached on scaling group. See Block vserver_group below for details.
         * 
         * @return builder
         * 
         */
        public Builder vserverGroups(List<ScalingGroupVServerGroupsVserverGroupArgs> vserverGroups) {
            return vserverGroups(Output.of(vserverGroups));
        }

        /**
         * @param vserverGroups A list of vserver groups attached on scaling group. See Block vserver_group below for details.
         * 
         * @return builder
         * 
         */
        public Builder vserverGroups(ScalingGroupVServerGroupsVserverGroupArgs... vserverGroups) {
            return vserverGroups(List.of(vserverGroups));
        }

        public ScalingGroupVServerGroupsState build() {
            return $;
        }
    }

}
