// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ErEnvConfPresetCanaryGansu {
    /**
     * @return Allowed DCDN domain names.
     * 
     */
    private final @Nullable List<String> allowedHosts;
    /**
     * @return The version number of the code.
     * 
     */
    private final @Nullable String codeRev;
    /**
     * @return The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
     * 
     */
    private final @Nullable String specName;

    @CustomType.Constructor
    private ErEnvConfPresetCanaryGansu(
        @CustomType.Parameter("allowedHosts") @Nullable List<String> allowedHosts,
        @CustomType.Parameter("codeRev") @Nullable String codeRev,
        @CustomType.Parameter("specName") @Nullable String specName) {
        this.allowedHosts = allowedHosts;
        this.codeRev = codeRev;
        this.specName = specName;
    }

    /**
     * @return Allowed DCDN domain names.
     * 
     */
    public List<String> allowedHosts() {
        return this.allowedHosts == null ? List.of() : this.allowedHosts;
    }
    /**
     * @return The version number of the code.
     * 
     */
    public Optional<String> codeRev() {
        return Optional.ofNullable(this.codeRev);
    }
    /**
     * @return The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
     * 
     */
    public Optional<String> specName() {
        return Optional.ofNullable(this.specName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErEnvConfPresetCanaryGansu defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedHosts;
        private @Nullable String codeRev;
        private @Nullable String specName;

        public Builder() {
    	      // Empty
        }

        public Builder(ErEnvConfPresetCanaryGansu defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHosts = defaults.allowedHosts;
    	      this.codeRev = defaults.codeRev;
    	      this.specName = defaults.specName;
        }

        public Builder allowedHosts(@Nullable List<String> allowedHosts) {
            this.allowedHosts = allowedHosts;
            return this;
        }
        public Builder allowedHosts(String... allowedHosts) {
            return allowedHosts(List.of(allowedHosts));
        }
        public Builder codeRev(@Nullable String codeRev) {
            this.codeRev = codeRev;
            return this;
        }
        public Builder specName(@Nullable String specName) {
            this.specName = specName;
            return this;
        }        public ErEnvConfPresetCanaryGansu build() {
            return new ErEnvConfPresetCanaryGansu(allowedHosts, codeRev, specName);
        }
    }
}
