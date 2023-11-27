// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RocketMQInstanceSoftware {
    /**
     * @return Upgrade time period.
     * 
     */
    private @Nullable String maintainTime;
    /**
     * @return Software version.
     * 
     */
    private @Nullable String softwareVersion;
    /**
     * @return Upgrade method.
     * 
     */
    private @Nullable String upgradeMethod;

    private RocketMQInstanceSoftware() {}
    /**
     * @return Upgrade time period.
     * 
     */
    public Optional<String> maintainTime() {
        return Optional.ofNullable(this.maintainTime);
    }
    /**
     * @return Software version.
     * 
     */
    public Optional<String> softwareVersion() {
        return Optional.ofNullable(this.softwareVersion);
    }
    /**
     * @return Upgrade method.
     * 
     */
    public Optional<String> upgradeMethod() {
        return Optional.ofNullable(this.upgradeMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RocketMQInstanceSoftware defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maintainTime;
        private @Nullable String softwareVersion;
        private @Nullable String upgradeMethod;
        public Builder() {}
        public Builder(RocketMQInstanceSoftware defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintainTime = defaults.maintainTime;
    	      this.softwareVersion = defaults.softwareVersion;
    	      this.upgradeMethod = defaults.upgradeMethod;
        }

        @CustomType.Setter
        public Builder maintainTime(@Nullable String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        @CustomType.Setter
        public Builder softwareVersion(@Nullable String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        @CustomType.Setter
        public Builder upgradeMethod(@Nullable String upgradeMethod) {
            this.upgradeMethod = upgradeMethod;
            return this;
        }
        public RocketMQInstanceSoftware build() {
            final var _resultValue = new RocketMQInstanceSoftware();
            _resultValue.maintainTime = maintainTime;
            _resultValue.softwareVersion = softwareVersion;
            _resultValue.upgradeMethod = upgradeMethod;
            return _resultValue;
        }
    }
}
