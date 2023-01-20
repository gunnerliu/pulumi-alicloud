// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.alicloud.ga.inputs.EndpointGroupEndpointConfigurationArgs;
import com.pulumi.alicloud.ga.inputs.EndpointGroupPortOverridesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointGroupState extends com.pulumi.resources.ResourceArgs {

    public static final EndpointGroupState Empty = new EndpointGroupState();

    /**
     * The ID of the Global Accelerator instance to which the endpoint group will be added.
     * 
     */
    @Import(name="acceleratorId")
    private @Nullable Output<String> acceleratorId;

    /**
     * @return The ID of the Global Accelerator instance to which the endpoint group will be added.
     * 
     */
    public Optional<Output<String>> acceleratorId() {
        return Optional.ofNullable(this.acceleratorId);
    }

    /**
     * The description of the endpoint group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the endpoint group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
     * 
     */
    @Import(name="endpointConfigurations")
    private @Nullable Output<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations;

    /**
     * @return The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
     * 
     */
    public Optional<Output<List<EndpointGroupEndpointConfigurationArgs>>> endpointConfigurations() {
        return Optional.ofNullable(this.endpointConfigurations);
    }

    /**
     * The ID of the region where the endpoint group is deployed.
     * 
     */
    @Import(name="endpointGroupRegion")
    private @Nullable Output<String> endpointGroupRegion;

    /**
     * @return The ID of the region where the endpoint group is deployed.
     * 
     */
    public Optional<Output<String>> endpointGroupRegion() {
        return Optional.ofNullable(this.endpointGroupRegion);
    }

    /**
     * The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
     * 
     */
    @Import(name="endpointGroupType")
    private @Nullable Output<String> endpointGroupType;

    /**
     * @return The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
     * 
     */
    public Optional<Output<String>> endpointGroupType() {
        return Optional.ofNullable(this.endpointGroupType);
    }

    /**
     * The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
     * 
     */
    @Import(name="endpointRequestProtocol")
    private @Nullable Output<String> endpointRequestProtocol;

    /**
     * @return The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
     * 
     */
    public Optional<Output<String>> endpointRequestProtocol() {
        return Optional.ofNullable(this.endpointRequestProtocol);
    }

    /**
     * The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    @Import(name="healthCheckIntervalSeconds")
    private @Nullable Output<Integer> healthCheckIntervalSeconds;

    /**
     * @return The interval between two consecutive health checks. Unit: seconds.
     * 
     */
    public Optional<Output<Integer>> healthCheckIntervalSeconds() {
        return Optional.ofNullable(this.healthCheckIntervalSeconds);
    }

    /**
     * The path specified as the destination of the targets for health checks.
     * 
     */
    @Import(name="healthCheckPath")
    private @Nullable Output<String> healthCheckPath;

    /**
     * @return The path specified as the destination of the targets for health checks.
     * 
     */
    public Optional<Output<String>> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }

    /**
     * The port that is used for health checks.
     * 
     */
    @Import(name="healthCheckPort")
    private @Nullable Output<Integer> healthCheckPort;

    /**
     * @return The port that is used for health checks.
     * 
     */
    public Optional<Output<Integer>> healthCheckPort() {
        return Optional.ofNullable(this.healthCheckPort);
    }

    /**
     * The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
     * 
     */
    @Import(name="healthCheckProtocol")
    private @Nullable Output<String> healthCheckProtocol;

    /**
     * @return The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
     * 
     */
    public Optional<Output<String>> healthCheckProtocol() {
        return Optional.ofNullable(this.healthCheckProtocol);
    }

    /**
     * The ID of the listener that is associated with the endpoint group.
     * 
     */
    @Import(name="listenerId")
    private @Nullable Output<String> listenerId;

    /**
     * @return The ID of the listener that is associated with the endpoint group.
     * 
     */
    public Optional<Output<String>> listenerId() {
        return Optional.ofNullable(this.listenerId);
    }

    /**
     * The name of the endpoint group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the endpoint group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
     * 
     */
    @Import(name="portOverrides")
    private @Nullable Output<EndpointGroupPortOverridesArgs> portOverrides;

    /**
     * @return Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
     * 
     */
    public Optional<Output<EndpointGroupPortOverridesArgs>> portOverrides() {
        return Optional.ofNullable(this.portOverrides);
    }

    /**
     * The status of the endpoint group.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the endpoint group.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
     * 
     */
    @Import(name="thresholdCount")
    private @Nullable Output<Integer> thresholdCount;

    /**
     * @return The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
     * 
     */
    public Optional<Output<Integer>> thresholdCount() {
        return Optional.ofNullable(this.thresholdCount);
    }

    /**
     * The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
     * 
     */
    @Import(name="trafficPercentage")
    private @Nullable Output<Integer> trafficPercentage;

    /**
     * @return The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
     * 
     */
    public Optional<Output<Integer>> trafficPercentage() {
        return Optional.ofNullable(this.trafficPercentage);
    }

    private EndpointGroupState() {}

    private EndpointGroupState(EndpointGroupState $) {
        this.acceleratorId = $.acceleratorId;
        this.description = $.description;
        this.endpointConfigurations = $.endpointConfigurations;
        this.endpointGroupRegion = $.endpointGroupRegion;
        this.endpointGroupType = $.endpointGroupType;
        this.endpointRequestProtocol = $.endpointRequestProtocol;
        this.healthCheckIntervalSeconds = $.healthCheckIntervalSeconds;
        this.healthCheckPath = $.healthCheckPath;
        this.healthCheckPort = $.healthCheckPort;
        this.healthCheckProtocol = $.healthCheckProtocol;
        this.listenerId = $.listenerId;
        this.name = $.name;
        this.portOverrides = $.portOverrides;
        this.status = $.status;
        this.thresholdCount = $.thresholdCount;
        this.trafficPercentage = $.trafficPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointGroupState $;

        public Builder() {
            $ = new EndpointGroupState();
        }

        public Builder(EndpointGroupState defaults) {
            $ = new EndpointGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance to which the endpoint group will be added.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(@Nullable Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the Global Accelerator instance to which the endpoint group will be added.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param description The description of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endpointConfigurations The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigurations(@Nullable Output<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations) {
            $.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * @param endpointConfigurations The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigurations(List<EndpointGroupEndpointConfigurationArgs> endpointConfigurations) {
            return endpointConfigurations(Output.of(endpointConfigurations));
        }

        /**
         * @param endpointConfigurations The endpointConfigurations of the endpoint group. See the following `Block endpoint_configurations`.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigurations(EndpointGroupEndpointConfigurationArgs... endpointConfigurations) {
            return endpointConfigurations(List.of(endpointConfigurations));
        }

        /**
         * @param endpointGroupRegion The ID of the region where the endpoint group is deployed.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupRegion(@Nullable Output<String> endpointGroupRegion) {
            $.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * @param endpointGroupRegion The ID of the region where the endpoint group is deployed.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            return endpointGroupRegion(Output.of(endpointGroupRegion));
        }

        /**
         * @param endpointGroupType The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupType(@Nullable Output<String> endpointGroupType) {
            $.endpointGroupType = endpointGroupType;
            return this;
        }

        /**
         * @param endpointGroupType The endpoint group type. Valid values: `default`, `virtual`. Default value is `default`.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupType(String endpointGroupType) {
            return endpointGroupType(Output.of(endpointGroupType));
        }

        /**
         * @param endpointRequestProtocol The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder endpointRequestProtocol(@Nullable Output<String> endpointRequestProtocol) {
            $.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }

        /**
         * @param endpointRequestProtocol The endpoint request protocol. Valid value: `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder endpointRequestProtocol(String endpointRequestProtocol) {
            return endpointRequestProtocol(Output.of(endpointRequestProtocol));
        }

        /**
         * @param healthCheckIntervalSeconds The interval between two consecutive health checks. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckIntervalSeconds(@Nullable Output<Integer> healthCheckIntervalSeconds) {
            $.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * @param healthCheckIntervalSeconds The interval between two consecutive health checks. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            return healthCheckIntervalSeconds(Output.of(healthCheckIntervalSeconds));
        }

        /**
         * @param healthCheckPath The path specified as the destination of the targets for health checks.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * @param healthCheckPath The path specified as the destination of the targets for health checks.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPath(String healthCheckPath) {
            return healthCheckPath(Output.of(healthCheckPath));
        }

        /**
         * @param healthCheckPort The port that is used for health checks.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPort(@Nullable Output<Integer> healthCheckPort) {
            $.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * @param healthCheckPort The port that is used for health checks.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            return healthCheckPort(Output.of(healthCheckPort));
        }

        /**
         * @param healthCheckProtocol The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckProtocol(@Nullable Output<String> healthCheckProtocol) {
            $.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * @param healthCheckProtocol The protocol that is used to connect to the targets for health checks. Valid values: `http`, `https`, `tcp`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            return healthCheckProtocol(Output.of(healthCheckProtocol));
        }

        /**
         * @param listenerId The ID of the listener that is associated with the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(@Nullable Output<String> listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param listenerId The ID of the listener that is associated with the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(String listenerId) {
            return listenerId(Output.of(listenerId));
        }

        /**
         * @param name The name of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param portOverrides Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
         * 
         * @return builder
         * 
         */
        public Builder portOverrides(@Nullable Output<EndpointGroupPortOverridesArgs> portOverrides) {
            $.portOverrides = portOverrides;
            return this;
        }

        /**
         * @param portOverrides Mapping between listening port and forwarding port of boarding point. See the following `Block port_overrides`.
         * 
         * @return builder
         * 
         */
        public Builder portOverrides(EndpointGroupPortOverridesArgs portOverrides) {
            return portOverrides(Output.of(portOverrides));
        }

        /**
         * @param status The status of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the endpoint group.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param thresholdCount The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
         * 
         * @return builder
         * 
         */
        public Builder thresholdCount(@Nullable Output<Integer> thresholdCount) {
            $.thresholdCount = thresholdCount;
            return this;
        }

        /**
         * @param thresholdCount The number of consecutive failed heath checks that must occur before the endpoint is deemed unhealthy. Default value is `3`.
         * 
         * @return builder
         * 
         */
        public Builder thresholdCount(Integer thresholdCount) {
            return thresholdCount(Output.of(thresholdCount));
        }

        /**
         * @param trafficPercentage The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
         * 
         * @return builder
         * 
         */
        public Builder trafficPercentage(@Nullable Output<Integer> trafficPercentage) {
            $.trafficPercentage = trafficPercentage;
            return this;
        }

        /**
         * @param trafficPercentage The weight of the endpoint group when the corresponding listener is associated with multiple endpoint groups.
         * 
         * @return builder
         * 
         */
        public Builder trafficPercentage(Integer trafficPercentage) {
            return trafficPercentage(Output.of(trafficPercentage));
        }

        public EndpointGroupState build() {
            return $;
        }
    }

}
