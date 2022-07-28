// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlbServerGroupAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlbServerGroupAttachmentArgs Empty = new AlbServerGroupAttachmentArgs();

    /**
     * ID of Alb Server Group.
     * 
     */
    @Import(name="albServerGroupId", required=true)
    private Output<String> albServerGroupId;

    /**
     * @return ID of Alb Server Group.
     * 
     */
    public Output<String> albServerGroupId() {
        return this.albServerGroupId;
    }

    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     * 
     */
    @Import(name="forceAttach")
    private @Nullable Output<Boolean> forceAttach;

    /**
     * @return If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     * 
     */
    public Optional<Output<Boolean>> forceAttach() {
        return Optional.ofNullable(this.forceAttach);
    }

    /**
     * - The port will be used for Alb Server Group backend server.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return - The port will be used for Alb Server Group backend server.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * ID of the scaling group.
     * 
     */
    @Import(name="scalingGroupId", required=true)
    private Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group.
     * 
     */
    public Output<String> scalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * The weight of an ECS instance attached to the Alb Server Group.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return The weight of an ECS instance attached to the Alb Server Group.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private AlbServerGroupAttachmentArgs() {}

    private AlbServerGroupAttachmentArgs(AlbServerGroupAttachmentArgs $) {
        this.albServerGroupId = $.albServerGroupId;
        this.forceAttach = $.forceAttach;
        this.port = $.port;
        this.scalingGroupId = $.scalingGroupId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlbServerGroupAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlbServerGroupAttachmentArgs $;

        public Builder() {
            $ = new AlbServerGroupAttachmentArgs();
        }

        public Builder(AlbServerGroupAttachmentArgs defaults) {
            $ = new AlbServerGroupAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param albServerGroupId ID of Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder albServerGroupId(Output<String> albServerGroupId) {
            $.albServerGroupId = albServerGroupId;
            return this;
        }

        /**
         * @param albServerGroupId ID of Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder albServerGroupId(String albServerGroupId) {
            return albServerGroupId(Output.of(albServerGroupId));
        }

        /**
         * @param forceAttach If instances of scaling group are attached/removed from slb backend server when attach/detach alb
         * server group from scaling group. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder forceAttach(@Nullable Output<Boolean> forceAttach) {
            $.forceAttach = forceAttach;
            return this;
        }

        /**
         * @param forceAttach If instances of scaling group are attached/removed from slb backend server when attach/detach alb
         * server group from scaling group. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder forceAttach(Boolean forceAttach) {
            return forceAttach(Output.of(forceAttach));
        }

        /**
         * @param port - The port will be used for Alb Server Group backend server.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port - The port will be used for Alb Server Group backend server.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param scalingGroupId ID of the scaling group.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(Output<String> scalingGroupId) {
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
         * @param weight The weight of an ECS instance attached to the Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight of an ECS instance attached to the Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public AlbServerGroupAttachmentArgs build() {
            $.albServerGroupId = Objects.requireNonNull($.albServerGroupId, "expected parameter 'albServerGroupId' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.scalingGroupId = Objects.requireNonNull($.scalingGroupId, "expected parameter 'scalingGroupId' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
