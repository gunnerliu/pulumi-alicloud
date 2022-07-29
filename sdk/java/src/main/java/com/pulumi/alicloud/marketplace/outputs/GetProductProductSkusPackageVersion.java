// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductProductSkusPackageVersion {
    /**
     * @return The package name of this product sku package.
     * 
     */
    private final String packageName;
    /**
     * @return The package version of this product sku package. Currently, the API products can return package_version, but others can not for ensure.
     * 
     */
    private final String packageVersion;

    @CustomType.Constructor
    private GetProductProductSkusPackageVersion(
        @CustomType.Parameter("packageName") String packageName,
        @CustomType.Parameter("packageVersion") String packageVersion) {
        this.packageName = packageName;
        this.packageVersion = packageVersion;
    }

    /**
     * @return The package name of this product sku package.
     * 
     */
    public String packageName() {
        return this.packageName;
    }
    /**
     * @return The package version of this product sku package. Currently, the API products can return package_version, but others can not for ensure.
     * 
     */
    public String packageVersion() {
        return this.packageVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductProductSkusPackageVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packageName;
        private String packageVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductProductSkusPackageVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageName = defaults.packageName;
    	      this.packageVersion = defaults.packageVersion;
        }

        public Builder packageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = Objects.requireNonNull(packageVersion);
            return this;
        }        public GetProductProductSkusPackageVersion build() {
            return new GetProductProductSkusPackageVersion(packageName, packageVersion);
        }
    }
}
