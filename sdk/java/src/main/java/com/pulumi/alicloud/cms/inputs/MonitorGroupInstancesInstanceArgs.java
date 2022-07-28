// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MonitorGroupInstancesInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorGroupInstancesInstanceArgs Empty = new MonitorGroupInstancesInstanceArgs();

    /**
     * The category of instance.
     * 
     */
    @Import(name="category", required=true)
    private Output<String> category;

    /**
     * @return The category of instance.
     * 
     */
    public Output<String> category() {
        return this.category;
    }

    /**
     * The id of instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The id of instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The name of instance.
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return The name of instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * The region id of instance.
     * 
     */
    @Import(name="regionId", required=true)
    private Output<String> regionId;

    /**
     * @return The region id of instance.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }

    private MonitorGroupInstancesInstanceArgs() {}

    private MonitorGroupInstancesInstanceArgs(MonitorGroupInstancesInstanceArgs $) {
        this.category = $.category;
        this.instanceId = $.instanceId;
        this.instanceName = $.instanceName;
        this.regionId = $.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorGroupInstancesInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorGroupInstancesInstanceArgs $;

        public Builder() {
            $ = new MonitorGroupInstancesInstanceArgs();
        }

        public Builder(MonitorGroupInstancesInstanceArgs defaults) {
            $ = new MonitorGroupInstancesInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category The category of instance.
         * 
         * @return builder
         * 
         */
        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of instance.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param instanceId The id of instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The id of instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceName The name of instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param regionId The region id of instance.
         * 
         * @return builder
         * 
         */
        public Builder regionId(Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId The region id of instance.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        public MonitorGroupInstancesInstanceArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.instanceName = Objects.requireNonNull($.instanceName, "expected parameter 'instanceName' to be non-null");
            $.regionId = Objects.requireNonNull($.regionId, "expected parameter 'regionId' to be non-null");
            return $;
        }
    }

}
