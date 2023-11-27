// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterConfig {
    /**
     * @return Custom configuration service config key, e.g. ’dfs.replication’.
     * 
     */
    private String configKey;
    /**
     * @return Custom configuration service config value, e.g. ’3’.
     * 
     */
    private String configValue;
    /**
     * @return Custom configuration service file name, e.g. ’hdfs-site’.
     * 
     */
    private String fileName;
    /**
     * @return Custom configuration service name, e.g. ’HDFS’.
     * 
     */
    private String serviceName;

    private ClusterConfig() {}
    /**
     * @return Custom configuration service config key, e.g. ’dfs.replication’.
     * 
     */
    public String configKey() {
        return this.configKey;
    }
    /**
     * @return Custom configuration service config value, e.g. ’3’.
     * 
     */
    public String configValue() {
        return this.configValue;
    }
    /**
     * @return Custom configuration service file name, e.g. ’hdfs-site’.
     * 
     */
    public String fileName() {
        return this.fileName;
    }
    /**
     * @return Custom configuration service name, e.g. ’HDFS’.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configKey;
        private String configValue;
        private String fileName;
        private String serviceName;
        public Builder() {}
        public Builder(ClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configKey = defaults.configKey;
    	      this.configValue = defaults.configValue;
    	      this.fileName = defaults.fileName;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder configKey(String configKey) {
            this.configKey = Objects.requireNonNull(configKey);
            return this;
        }
        @CustomType.Setter
        public Builder configValue(String configValue) {
            this.configValue = Objects.requireNonNull(configValue);
            return this;
        }
        @CustomType.Setter
        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public ClusterConfig build() {
            final var _resultValue = new ClusterConfig();
            _resultValue.configKey = configKey;
            _resultValue.configValue = configValue;
            _resultValue.fileName = fileName;
            _resultValue.serviceName = serviceName;
            return _resultValue;
        }
    }
}
