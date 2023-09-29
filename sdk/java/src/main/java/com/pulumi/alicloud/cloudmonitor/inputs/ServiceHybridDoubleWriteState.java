// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceHybridDoubleWriteState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHybridDoubleWriteState Empty = new ServiceHybridDoubleWriteState();

    /**
     * Target Namespace.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Target Namespace.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Source Namespace.
     * 
     */
    @Import(name="sourceNamespace")
    private @Nullable Output<String> sourceNamespace;

    /**
     * @return Source Namespace.
     * 
     */
    public Optional<Output<String>> sourceNamespace() {
        return Optional.ofNullable(this.sourceNamespace);
    }

    /**
     * Source UserId.
     * 
     */
    @Import(name="sourceUserId")
    private @Nullable Output<String> sourceUserId;

    /**
     * @return Source UserId.
     * 
     */
    public Optional<Output<String>> sourceUserId() {
        return Optional.ofNullable(this.sourceUserId);
    }

    /**
     * Target UserId.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return Target UserId.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private ServiceHybridDoubleWriteState() {}

    private ServiceHybridDoubleWriteState(ServiceHybridDoubleWriteState $) {
        this.namespace = $.namespace;
        this.sourceNamespace = $.sourceNamespace;
        this.sourceUserId = $.sourceUserId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHybridDoubleWriteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHybridDoubleWriteState $;

        public Builder() {
            $ = new ServiceHybridDoubleWriteState();
        }

        public Builder(ServiceHybridDoubleWriteState defaults) {
            $ = new ServiceHybridDoubleWriteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace Target Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Target Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param sourceNamespace Source Namespace.
         * 
         * @return builder
         * 
         */
        public Builder sourceNamespace(@Nullable Output<String> sourceNamespace) {
            $.sourceNamespace = sourceNamespace;
            return this;
        }

        /**
         * @param sourceNamespace Source Namespace.
         * 
         * @return builder
         * 
         */
        public Builder sourceNamespace(String sourceNamespace) {
            return sourceNamespace(Output.of(sourceNamespace));
        }

        /**
         * @param sourceUserId Source UserId.
         * 
         * @return builder
         * 
         */
        public Builder sourceUserId(@Nullable Output<String> sourceUserId) {
            $.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * @param sourceUserId Source UserId.
         * 
         * @return builder
         * 
         */
        public Builder sourceUserId(String sourceUserId) {
            return sourceUserId(Output.of(sourceUserId));
        }

        /**
         * @param userId Target UserId.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId Target UserId.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public ServiceHybridDoubleWriteState build() {
            return $;
        }
    }

}