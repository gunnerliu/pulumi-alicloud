// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceServerlessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceServerlessConfigArgs Empty = new InstanceServerlessConfigArgs();

    /**
     * Specifies whether to enable the smart startup and stop feature for the serverless instance. Valid values:
     * - true: enables the feature.
     * - false: disables the feature. This is the default value.
     * &gt; - Only MySQL Serverless instances need to set this parameter. If there is no connection within 10 minutes, it will enter a paused state and automatically wake up when the connection enters.
     * 
     */
    @Import(name="autoPause")
    private @Nullable Output<Boolean> autoPause;

    /**
     * @return Specifies whether to enable the smart startup and stop feature for the serverless instance. Valid values:
     * - true: enables the feature.
     * - false: disables the feature. This is the default value.
     * &gt; - Only MySQL Serverless instances need to set this parameter. If there is no connection within 10 minutes, it will enter a paused state and automatically wake up when the connection enters.
     * 
     */
    public Optional<Output<Boolean>> autoPause() {
        return Optional.ofNullable(this.autoPause);
    }

    /**
     * The maximum number of RDS Capacity Units (RCUs). The value of this parameter must be greater than or equal to `min_capacity` and only supports passing integers. Valid values:
     * - MySQL: 1~8
     * - SQLServer: 2~8
     * - PostgreSQL: 1~12
     * 
     */
    @Import(name="maxCapacity", required=true)
    private Output<Double> maxCapacity;

    /**
     * @return The maximum number of RDS Capacity Units (RCUs). The value of this parameter must be greater than or equal to `min_capacity` and only supports passing integers. Valid values:
     * - MySQL: 1~8
     * - SQLServer: 2~8
     * - PostgreSQL: 1~12
     * 
     */
    public Output<Double> maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * The minimum number of RCUs. The value of this parameter must be less than or equal to `max_capacity`. Valid values:
     * - MySQL: 0.5~8
     * - SQLServer: 2~8 \(Supports integers only\).
     * - PostgreSQL: 0.5~12
     * 
     */
    @Import(name="minCapacity", required=true)
    private Output<Double> minCapacity;

    /**
     * @return The minimum number of RCUs. The value of this parameter must be less than or equal to `max_capacity`. Valid values:
     * - MySQL: 0.5~8
     * - SQLServer: 2~8 \(Supports integers only\).
     * - PostgreSQL: 0.5~12
     * 
     */
    public Output<Double> minCapacity() {
        return this.minCapacity;
    }

    /**
     * Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:
     * - true: enables the feature.
     * - false: disables the feature. This is the default value.
     * &gt; - Only MySQL Serverless instances need to set this parameter. After enabling this parameter, there will be a flash break within 1 minute when the instance is forced to expand or shrink. Please use it with caution according to the actual situation.
     * &gt; - The elastic scaling of an instance RCU usually takes effect immediately, but in some special circumstances (such as during large transaction execution), it is not possible to complete scaling immediately. In this case, this parameter can be enabled to force scaling.
     * 
     */
    @Import(name="switchForce")
    private @Nullable Output<Boolean> switchForce;

    /**
     * @return Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:
     * - true: enables the feature.
     * - false: disables the feature. This is the default value.
     * &gt; - Only MySQL Serverless instances need to set this parameter. After enabling this parameter, there will be a flash break within 1 minute when the instance is forced to expand or shrink. Please use it with caution according to the actual situation.
     * &gt; - The elastic scaling of an instance RCU usually takes effect immediately, but in some special circumstances (such as during large transaction execution), it is not possible to complete scaling immediately. In this case, this parameter can be enabled to force scaling.
     * 
     */
    public Optional<Output<Boolean>> switchForce() {
        return Optional.ofNullable(this.switchForce);
    }

    private InstanceServerlessConfigArgs() {}

    private InstanceServerlessConfigArgs(InstanceServerlessConfigArgs $) {
        this.autoPause = $.autoPause;
        this.maxCapacity = $.maxCapacity;
        this.minCapacity = $.minCapacity;
        this.switchForce = $.switchForce;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceServerlessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceServerlessConfigArgs $;

        public Builder() {
            $ = new InstanceServerlessConfigArgs();
        }

        public Builder(InstanceServerlessConfigArgs defaults) {
            $ = new InstanceServerlessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPause Specifies whether to enable the smart startup and stop feature for the serverless instance. Valid values:
         * - true: enables the feature.
         * - false: disables the feature. This is the default value.
         * &gt; - Only MySQL Serverless instances need to set this parameter. If there is no connection within 10 minutes, it will enter a paused state and automatically wake up when the connection enters.
         * 
         * @return builder
         * 
         */
        public Builder autoPause(@Nullable Output<Boolean> autoPause) {
            $.autoPause = autoPause;
            return this;
        }

        /**
         * @param autoPause Specifies whether to enable the smart startup and stop feature for the serverless instance. Valid values:
         * - true: enables the feature.
         * - false: disables the feature. This is the default value.
         * &gt; - Only MySQL Serverless instances need to set this parameter. If there is no connection within 10 minutes, it will enter a paused state and automatically wake up when the connection enters.
         * 
         * @return builder
         * 
         */
        public Builder autoPause(Boolean autoPause) {
            return autoPause(Output.of(autoPause));
        }

        /**
         * @param maxCapacity The maximum number of RDS Capacity Units (RCUs). The value of this parameter must be greater than or equal to `min_capacity` and only supports passing integers. Valid values:
         * - MySQL: 1~8
         * - SQLServer: 2~8
         * - PostgreSQL: 1~12
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(Output<Double> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * @param maxCapacity The maximum number of RDS Capacity Units (RCUs). The value of this parameter must be greater than or equal to `min_capacity` and only supports passing integers. Valid values:
         * - MySQL: 1~8
         * - SQLServer: 2~8
         * - PostgreSQL: 1~12
         * 
         * @return builder
         * 
         */
        public Builder maxCapacity(Double maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        /**
         * @param minCapacity The minimum number of RCUs. The value of this parameter must be less than or equal to `max_capacity`. Valid values:
         * - MySQL: 0.5~8
         * - SQLServer: 2~8 \(Supports integers only\).
         * - PostgreSQL: 0.5~12
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Output<Double> minCapacity) {
            $.minCapacity = minCapacity;
            return this;
        }

        /**
         * @param minCapacity The minimum number of RCUs. The value of this parameter must be less than or equal to `max_capacity`. Valid values:
         * - MySQL: 0.5~8
         * - SQLServer: 2~8 \(Supports integers only\).
         * - PostgreSQL: 0.5~12
         * 
         * @return builder
         * 
         */
        public Builder minCapacity(Double minCapacity) {
            return minCapacity(Output.of(minCapacity));
        }

        /**
         * @param switchForce Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:
         * - true: enables the feature.
         * - false: disables the feature. This is the default value.
         * &gt; - Only MySQL Serverless instances need to set this parameter. After enabling this parameter, there will be a flash break within 1 minute when the instance is forced to expand or shrink. Please use it with caution according to the actual situation.
         * &gt; - The elastic scaling of an instance RCU usually takes effect immediately, but in some special circumstances (such as during large transaction execution), it is not possible to complete scaling immediately. In this case, this parameter can be enabled to force scaling.
         * 
         * @return builder
         * 
         */
        public Builder switchForce(@Nullable Output<Boolean> switchForce) {
            $.switchForce = switchForce;
            return this;
        }

        /**
         * @param switchForce Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:
         * - true: enables the feature.
         * - false: disables the feature. This is the default value.
         * &gt; - Only MySQL Serverless instances need to set this parameter. After enabling this parameter, there will be a flash break within 1 minute when the instance is forced to expand or shrink. Please use it with caution according to the actual situation.
         * &gt; - The elastic scaling of an instance RCU usually takes effect immediately, but in some special circumstances (such as during large transaction execution), it is not possible to complete scaling immediately. In this case, this parameter can be enabled to force scaling.
         * 
         * @return builder
         * 
         */
        public Builder switchForce(Boolean switchForce) {
            return switchForce(Output.of(switchForce));
        }

        public InstanceServerlessConfigArgs build() {
            if ($.maxCapacity == null) {
                throw new MissingRequiredPropertyException("InstanceServerlessConfigArgs", "maxCapacity");
            }
            if ($.minCapacity == null) {
                throw new MissingRequiredPropertyException("InstanceServerlessConfigArgs", "minCapacity");
            }
            return $;
        }
    }

}
