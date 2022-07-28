// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQuotasDimension extends com.pulumi.resources.InvokeArgs {

    public static final GetQuotasDimension Empty = new GetQuotasDimension();

    /**
     * The key of dimensions.
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    /**
     * @return The key of dimensions.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The value of dimensions.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return The value of dimensions.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetQuotasDimension() {}

    private GetQuotasDimension(GetQuotasDimension $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQuotasDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQuotasDimension $;

        public Builder() {
            $ = new GetQuotasDimension();
        }

        public Builder(GetQuotasDimension defaults) {
            $ = new GetQuotasDimension(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of dimensions.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value The value of dimensions.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetQuotasDimension build() {
            return $;
        }
    }

}
