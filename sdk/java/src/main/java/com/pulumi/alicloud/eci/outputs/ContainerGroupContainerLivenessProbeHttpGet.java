// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerGroupContainerLivenessProbeHttpGet {
    /**
     * @return The relative file path.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The port number. Valid values: 1 to 65535.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The protocol type corresponding to the HTTP Get request when using the HTTP request method for health checks. Valid values: `HTTP`, `HTTPS`.
     * 
     */
    private final @Nullable String scheme;

    @CustomType.Constructor
    private ContainerGroupContainerLivenessProbeHttpGet(
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("scheme") @Nullable String scheme) {
        this.path = path;
        this.port = port;
        this.scheme = scheme;
    }

    /**
     * @return The relative file path.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The port number. Valid values: 1 to 65535.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The protocol type corresponding to the HTTP Get request when using the HTTP request method for health checks. Valid values: `HTTP`, `HTTPS`.
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupContainerLivenessProbeHttpGet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable String scheme;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupContainerLivenessProbeHttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.scheme = defaults.scheme;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }        public ContainerGroupContainerLivenessProbeHttpGet build() {
            return new ContainerGroupContainerLivenessProbeHttpGet(path, port, scheme);
        }
    }
}
