// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.alicloud.kms.inputs.InstanceBindVpcArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
     * 
     */
    @Import(name="bindVpcs")
    private @Nullable Output<List<InstanceBindVpcArgs>> bindVpcs;

    /**
     * @return Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
     * 
     */
    public Optional<Output<List<InstanceBindVpcArgs>>> bindVpcs() {
        return Optional.ofNullable(this.bindVpcs);
    }

    /**
     * Maximum number of stored keys.
     * 
     */
    @Import(name="keyNum", required=true)
    private Output<Integer> keyNum;

    /**
     * @return Maximum number of stored keys.
     * 
     */
    public Output<Integer> keyNum() {
        return this.keyNum;
    }

    /**
     * Instance Audit Log Switch.
     * 
     */
    @Import(name="log")
    private @Nullable Output<String> log;

    /**
     * @return Instance Audit Log Switch.
     * 
     */
    public Optional<Output<String>> log() {
        return Optional.ofNullable(this.log);
    }

    /**
     * Instance log capacity.
     * 
     */
    @Import(name="logStorage")
    private @Nullable Output<Integer> logStorage;

    /**
     * @return Instance log capacity.
     * 
     */
    public Optional<Output<Integer>> logStorage() {
        return Optional.ofNullable(this.logStorage);
    }

    /**
     * Purchase cycle, in months.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return Purchase cycle, in months.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * KMS Instance commodity type (software/hardware).
     * 
     */
    @Import(name="productVersion")
    private @Nullable Output<String> productVersion;

    /**
     * @return KMS Instance commodity type (software/hardware).
     * 
     */
    public Optional<Output<String>> productVersion() {
        return Optional.ofNullable(this.productVersion);
    }

    /**
     * Automatic renewal period, in months.
     * 
     */
    @Import(name="renewPeriod")
    private @Nullable Output<Integer> renewPeriod;

    /**
     * @return Automatic renewal period, in months.
     * 
     */
    public Optional<Output<Integer>> renewPeriod() {
        return Optional.ofNullable(this.renewPeriod);
    }

    /**
     * Renewal options (manual renewal, automatic renewal, no renewal).
     * 
     */
    @Import(name="renewStatus")
    private @Nullable Output<String> renewStatus;

    /**
     * @return Renewal options (manual renewal, automatic renewal, no renewal).
     * 
     */
    public Optional<Output<String>> renewStatus() {
        return Optional.ofNullable(this.renewStatus);
    }

    /**
     * Maximum number of Secrets.
     * 
     */
    @Import(name="secretNum", required=true)
    private Output<Integer> secretNum;

    /**
     * @return Maximum number of Secrets.
     * 
     */
    public Output<Integer> secretNum() {
        return this.secretNum;
    }

    /**
     * The computation performance level of the KMS instance.
     * 
     */
    @Import(name="spec", required=true)
    private Output<Integer> spec;

    /**
     * @return The computation performance level of the KMS instance.
     * 
     */
    public Output<Integer> spec() {
        return this.spec;
    }

    /**
     * Instance VPC id.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return Instance VPC id.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
     * 
     */
    @Import(name="vpcNum", required=true)
    private Output<Integer> vpcNum;

    /**
     * @return The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
     * 
     */
    public Output<Integer> vpcNum() {
        return this.vpcNum;
    }

    /**
     * Instance bind vswitches.
     * 
     */
    @Import(name="vswitchIds", required=true)
    private Output<List<String>> vswitchIds;

    /**
     * @return Instance bind vswitches.
     * 
     */
    public Output<List<String>> vswitchIds() {
        return this.vswitchIds;
    }

    /**
     * zone id.
     * 
     */
    @Import(name="zoneIds", required=true)
    private Output<List<String>> zoneIds;

    /**
     * @return zone id.
     * 
     */
    public Output<List<String>> zoneIds() {
        return this.zoneIds;
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.bindVpcs = $.bindVpcs;
        this.keyNum = $.keyNum;
        this.log = $.log;
        this.logStorage = $.logStorage;
        this.period = $.period;
        this.productVersion = $.productVersion;
        this.renewPeriod = $.renewPeriod;
        this.renewStatus = $.renewStatus;
        this.secretNum = $.secretNum;
        this.spec = $.spec;
        this.vpcId = $.vpcId;
        this.vpcNum = $.vpcNum;
        this.vswitchIds = $.vswitchIds;
        this.zoneIds = $.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bindVpcs Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
         * 
         * @return builder
         * 
         */
        public Builder bindVpcs(@Nullable Output<List<InstanceBindVpcArgs>> bindVpcs) {
            $.bindVpcs = bindVpcs;
            return this;
        }

        /**
         * @param bindVpcs Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
         * 
         * @return builder
         * 
         */
        public Builder bindVpcs(List<InstanceBindVpcArgs> bindVpcs) {
            return bindVpcs(Output.of(bindVpcs));
        }

        /**
         * @param bindVpcs Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
         * 
         * @return builder
         * 
         */
        public Builder bindVpcs(InstanceBindVpcArgs... bindVpcs) {
            return bindVpcs(List.of(bindVpcs));
        }

        /**
         * @param keyNum Maximum number of stored keys.
         * 
         * @return builder
         * 
         */
        public Builder keyNum(Output<Integer> keyNum) {
            $.keyNum = keyNum;
            return this;
        }

        /**
         * @param keyNum Maximum number of stored keys.
         * 
         * @return builder
         * 
         */
        public Builder keyNum(Integer keyNum) {
            return keyNum(Output.of(keyNum));
        }

        /**
         * @param log Instance Audit Log Switch.
         * 
         * @return builder
         * 
         */
        public Builder log(@Nullable Output<String> log) {
            $.log = log;
            return this;
        }

        /**
         * @param log Instance Audit Log Switch.
         * 
         * @return builder
         * 
         */
        public Builder log(String log) {
            return log(Output.of(log));
        }

        /**
         * @param logStorage Instance log capacity.
         * 
         * @return builder
         * 
         */
        public Builder logStorage(@Nullable Output<Integer> logStorage) {
            $.logStorage = logStorage;
            return this;
        }

        /**
         * @param logStorage Instance log capacity.
         * 
         * @return builder
         * 
         */
        public Builder logStorage(Integer logStorage) {
            return logStorage(Output.of(logStorage));
        }

        /**
         * @param period Purchase cycle, in months.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Purchase cycle, in months.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param productVersion KMS Instance commodity type (software/hardware).
         * 
         * @return builder
         * 
         */
        public Builder productVersion(@Nullable Output<String> productVersion) {
            $.productVersion = productVersion;
            return this;
        }

        /**
         * @param productVersion KMS Instance commodity type (software/hardware).
         * 
         * @return builder
         * 
         */
        public Builder productVersion(String productVersion) {
            return productVersion(Output.of(productVersion));
        }

        /**
         * @param renewPeriod Automatic renewal period, in months.
         * 
         * @return builder
         * 
         */
        public Builder renewPeriod(@Nullable Output<Integer> renewPeriod) {
            $.renewPeriod = renewPeriod;
            return this;
        }

        /**
         * @param renewPeriod Automatic renewal period, in months.
         * 
         * @return builder
         * 
         */
        public Builder renewPeriod(Integer renewPeriod) {
            return renewPeriod(Output.of(renewPeriod));
        }

        /**
         * @param renewStatus Renewal options (manual renewal, automatic renewal, no renewal).
         * 
         * @return builder
         * 
         */
        public Builder renewStatus(@Nullable Output<String> renewStatus) {
            $.renewStatus = renewStatus;
            return this;
        }

        /**
         * @param renewStatus Renewal options (manual renewal, automatic renewal, no renewal).
         * 
         * @return builder
         * 
         */
        public Builder renewStatus(String renewStatus) {
            return renewStatus(Output.of(renewStatus));
        }

        /**
         * @param secretNum Maximum number of Secrets.
         * 
         * @return builder
         * 
         */
        public Builder secretNum(Output<Integer> secretNum) {
            $.secretNum = secretNum;
            return this;
        }

        /**
         * @param secretNum Maximum number of Secrets.
         * 
         * @return builder
         * 
         */
        public Builder secretNum(Integer secretNum) {
            return secretNum(Output.of(secretNum));
        }

        /**
         * @param spec The computation performance level of the KMS instance.
         * 
         * @return builder
         * 
         */
        public Builder spec(Output<Integer> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The computation performance level of the KMS instance.
         * 
         * @return builder
         * 
         */
        public Builder spec(Integer spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param vpcId Instance VPC id.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId Instance VPC id.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcNum The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcNum(Output<Integer> vpcNum) {
            $.vpcNum = vpcNum;
            return this;
        }

        /**
         * @param vpcNum The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
         * 
         * @return builder
         * 
         */
        public Builder vpcNum(Integer vpcNum) {
            return vpcNum(Output.of(vpcNum));
        }

        /**
         * @param vswitchIds Instance bind vswitches.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(Output<List<String>> vswitchIds) {
            $.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * @param vswitchIds Instance bind vswitches.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(List<String> vswitchIds) {
            return vswitchIds(Output.of(vswitchIds));
        }

        /**
         * @param vswitchIds Instance bind vswitches.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }

        /**
         * @param zoneIds zone id.
         * 
         * @return builder
         * 
         */
        public Builder zoneIds(Output<List<String>> zoneIds) {
            $.zoneIds = zoneIds;
            return this;
        }

        /**
         * @param zoneIds zone id.
         * 
         * @return builder
         * 
         */
        public Builder zoneIds(List<String> zoneIds) {
            return zoneIds(Output.of(zoneIds));
        }

        /**
         * @param zoneIds zone id.
         * 
         * @return builder
         * 
         */
        public Builder zoneIds(String... zoneIds) {
            return zoneIds(List.of(zoneIds));
        }

        public InstanceArgs build() {
            if ($.keyNum == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "keyNum");
            }
            if ($.secretNum == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "secretNum");
            }
            if ($.spec == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "spec");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "vpcId");
            }
            if ($.vpcNum == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "vpcNum");
            }
            if ($.vswitchIds == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "vswitchIds");
            }
            if ($.zoneIds == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "zoneIds");
            }
            return $;
        }
    }

}
