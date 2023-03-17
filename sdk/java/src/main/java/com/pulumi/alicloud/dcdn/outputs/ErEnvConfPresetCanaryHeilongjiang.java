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
public final class ErEnvConfPresetCanaryHeilongjiang {
    /**
     * @return Allowed DCDN domain names.
     * 
     */
    private @Nullable List<String> allowedHosts;
    /**
     * @return The version number of the code.
     * 
     */
    private @Nullable String codeRev;
    /**
     * @return The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
     * 
     */
    private @Nullable String specName;

    private ErEnvConfPresetCanaryHeilongjiang() {}
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

    public static Builder builder(ErEnvConfPresetCanaryHeilongjiang defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedHosts;
        private @Nullable String codeRev;
        private @Nullable String specName;
        public Builder() {}
        public Builder(ErEnvConfPresetCanaryHeilongjiang defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHosts = defaults.allowedHosts;
    	      this.codeRev = defaults.codeRev;
    	      this.specName = defaults.specName;
        }

        @CustomType.Setter
        public Builder allowedHosts(@Nullable List<String> allowedHosts) {
            this.allowedHosts = allowedHosts;
            return this;
        }
        public Builder allowedHosts(String... allowedHosts) {
            return allowedHosts(List.of(allowedHosts));
        }
        @CustomType.Setter
        public Builder codeRev(@Nullable String codeRev) {
            this.codeRev = codeRev;
            return this;
        }
        @CustomType.Setter
        public Builder specName(@Nullable String specName) {
            this.specName = specName;
            return this;
        }
        public ErEnvConfPresetCanaryHeilongjiang build() {
            final var o = new ErEnvConfPresetCanaryHeilongjiang();
            o.allowedHosts = allowedHosts;
            o.codeRev = codeRev;
            o.specName = specName;
            return o;
        }
    }
}
