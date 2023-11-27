// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StoreShard {
    /**
     * @return The begin value of the shard range(MD5), included in the shard range.
     * 
     */
    private @Nullable String beginKey;
    /**
     * @return The end value of the shard range(MD5), not included in shard range.
     * 
     */
    private @Nullable String endKey;
    /**
     * @return The ID of the shard.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return Shard status, only two status of `readwrite` and `readonly`.
     * 
     */
    private @Nullable String status;

    private StoreShard() {}
    /**
     * @return The begin value of the shard range(MD5), included in the shard range.
     * 
     */
    public Optional<String> beginKey() {
        return Optional.ofNullable(this.beginKey);
    }
    /**
     * @return The end value of the shard range(MD5), not included in shard range.
     * 
     */
    public Optional<String> endKey() {
        return Optional.ofNullable(this.endKey);
    }
    /**
     * @return The ID of the shard.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Shard status, only two status of `readwrite` and `readonly`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoreShard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String beginKey;
        private @Nullable String endKey;
        private @Nullable Integer id;
        private @Nullable String status;
        public Builder() {}
        public Builder(StoreShard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginKey = defaults.beginKey;
    	      this.endKey = defaults.endKey;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder beginKey(@Nullable String beginKey) {
            this.beginKey = beginKey;
            return this;
        }
        @CustomType.Setter
        public Builder endKey(@Nullable String endKey) {
            this.endKey = endKey;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public StoreShard build() {
            final var _resultValue = new StoreShard();
            _resultValue.beginKey = beginKey;
            _resultValue.endKey = endKey;
            _resultValue.id = id;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
