// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNestServiceInstancesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetNestServiceInstancesFilter Empty = new GetNestServiceInstancesFilter();

    /**
     * The name of the filter. Valid Values: `Name`, `ServiceInstanceName`, `ServiceInstanceId`, `ServiceId`, `Version`, `Status`, `DeployType`, `ServiceType`, `OperationStartTimeBefore`, `OperationStartTimeAfter`, `OperationEndTimeBefore`, `OperationEndTimeAfter`, `OperatedServiceInstanceId`, `OperationServiceInstanceId`, `EnableInstanceOps`.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the filter. Valid Values: `Name`, `ServiceInstanceName`, `ServiceInstanceId`, `ServiceId`, `Version`, `Status`, `DeployType`, `ServiceType`, `OperationStartTimeBefore`, `OperationStartTimeAfter`, `OperationEndTimeBefore`, `OperationEndTimeAfter`, `OperatedServiceInstanceId`, `OperationServiceInstanceId`, `EnableInstanceOps`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Set of values that are accepted for the given field.
     * 
     */
    @Import(name="values")
    private @Nullable List<String> values;

    /**
     * @return Set of values that are accepted for the given field.
     * 
     */
    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetNestServiceInstancesFilter() {}

    private GetNestServiceInstancesFilter(GetNestServiceInstancesFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNestServiceInstancesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNestServiceInstancesFilter $;

        public Builder() {
            $ = new GetNestServiceInstancesFilter();
        }

        public Builder(GetNestServiceInstancesFilter defaults) {
            $ = new GetNestServiceInstancesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the filter. Valid Values: `Name`, `ServiceInstanceName`, `ServiceInstanceId`, `ServiceId`, `Version`, `Status`, `DeployType`, `ServiceType`, `OperationStartTimeBefore`, `OperationStartTimeAfter`, `OperationEndTimeBefore`, `OperationEndTimeAfter`, `OperatedServiceInstanceId`, `OperationServiceInstanceId`, `EnableInstanceOps`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetNestServiceInstancesFilter build() {
            return $;
        }
    }

}