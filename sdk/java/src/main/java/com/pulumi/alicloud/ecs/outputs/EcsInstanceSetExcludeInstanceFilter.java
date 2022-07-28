// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EcsInstanceSetExcludeInstanceFilter {
    /**
     * @return The type of the excluded. Valid values: `InstanceId`, `InstanceName`.
     * 
     */
    private final String key;
    /**
     * @return The value of the excluded. The identification of the excluded instances. It is a list of instance Ids or names.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private EcsInstanceSetExcludeInstanceFilter(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * @return The type of the excluded. Valid values: `InstanceId`, `InstanceName`.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of the excluded. The identification of the excluded instances. It is a list of instance Ids or names.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcsInstanceSetExcludeInstanceFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EcsInstanceSetExcludeInstanceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public EcsInstanceSetExcludeInstanceFilter build() {
            return new EcsInstanceSetExcludeInstanceFilter(key, values);
        }
    }
}
