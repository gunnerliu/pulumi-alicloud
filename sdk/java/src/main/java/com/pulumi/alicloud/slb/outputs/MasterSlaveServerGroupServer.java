// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MasterSlaveServerGroupServer {
    private @Nullable Integer isBackup;
    private Integer port;
    private String serverId;
    private @Nullable String serverType;
    private @Nullable String type;
    private @Nullable Integer weight;

    private MasterSlaveServerGroupServer() {}
    public Optional<Integer> isBackup() {
        return Optional.ofNullable(this.isBackup);
    }
    public Integer port() {
        return this.port;
    }
    public String serverId() {
        return this.serverId;
    }
    public Optional<String> serverType() {
        return Optional.ofNullable(this.serverType);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterSlaveServerGroupServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer isBackup;
        private Integer port;
        private String serverId;
        private @Nullable String serverType;
        private @Nullable String type;
        private @Nullable Integer weight;
        public Builder() {}
        public Builder(MasterSlaveServerGroupServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isBackup = defaults.isBackup;
    	      this.port = defaults.port;
    	      this.serverId = defaults.serverId;
    	      this.serverType = defaults.serverType;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder isBackup(@Nullable Integer isBackup) {
            this.isBackup = isBackup;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder serverId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        @CustomType.Setter
        public Builder serverType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public MasterSlaveServerGroupServer build() {
            final var _resultValue = new MasterSlaveServerGroupServer();
            _resultValue.isBackup = isBackup;
            _resultValue.port = port;
            _resultValue.serverId = serverId;
            _resultValue.serverType = serverType;
            _resultValue.type = type;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
