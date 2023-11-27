// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.marketplace.outputs;

import com.pulumi.alicloud.marketplace.outputs.GetProductProduct;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProductResult {
    private @Nullable String availableRegion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String productCode;
    /**
     * @return A product. It contains the following attributes:
     * 
     */
    private List<GetProductProduct> products;

    private GetProductResult() {}
    public Optional<String> availableRegion() {
        return Optional.ofNullable(this.availableRegion);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String productCode() {
        return this.productCode;
    }
    /**
     * @return A product. It contains the following attributes:
     * 
     */
    public List<GetProductProduct> products() {
        return this.products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availableRegion;
        private String id;
        private String productCode;
        private List<GetProductProduct> products;
        public Builder() {}
        public Builder(GetProductResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableRegion = defaults.availableRegion;
    	      this.id = defaults.id;
    	      this.productCode = defaults.productCode;
    	      this.products = defaults.products;
        }

        @CustomType.Setter
        public Builder availableRegion(@Nullable String availableRegion) {
            this.availableRegion = availableRegion;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder productCode(String productCode) {
            this.productCode = Objects.requireNonNull(productCode);
            return this;
        }
        @CustomType.Setter
        public Builder products(List<GetProductProduct> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public Builder products(GetProductProduct... products) {
            return products(List.of(products));
        }
        public GetProductResult build() {
            final var _resultValue = new GetProductResult();
            _resultValue.availableRegion = availableRegion;
            _resultValue.id = id;
            _resultValue.productCode = productCode;
            _resultValue.products = products;
            return _resultValue;
        }
    }
}
