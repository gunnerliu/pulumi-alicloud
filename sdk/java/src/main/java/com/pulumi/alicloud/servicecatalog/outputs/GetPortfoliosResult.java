// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.outputs;

import com.pulumi.alicloud.servicecatalog.outputs.GetPortfoliosPortfolio;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPortfoliosResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of Portfolio IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of name of Portfolios.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable Integer pageNumber;
    private final @Nullable Integer pageSize;
    /**
     * @return A list of Portfolio Entries. Each element contains the following attributes:
     * 
     */
    private final List<GetPortfoliosPortfolio> portfolios;
    private final @Nullable String productId;
    private final @Nullable String scope;
    private final @Nullable String sortBy;
    private final @Nullable String sortOrder;

    @CustomType.Constructor
    private GetPortfoliosResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pageNumber") @Nullable Integer pageNumber,
        @CustomType.Parameter("pageSize") @Nullable Integer pageSize,
        @CustomType.Parameter("portfolios") List<GetPortfoliosPortfolio> portfolios,
        @CustomType.Parameter("productId") @Nullable String productId,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sortBy") @Nullable String sortBy,
        @CustomType.Parameter("sortOrder") @Nullable String sortOrder) {
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.portfolios = portfolios;
        this.productId = productId;
        this.scope = scope;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Portfolio IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of name of Portfolios.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }
    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }
    /**
     * @return A list of Portfolio Entries. Each element contains the following attributes:
     * 
     */
    public List<GetPortfoliosPortfolio> portfolios() {
        return this.portfolios;
    }
    public Optional<String> productId() {
        return Optional.ofNullable(this.productId);
    }
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    public Optional<String> sortBy() {
        return Optional.ofNullable(this.sortBy);
    }
    public Optional<String> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortfoliosResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable Integer pageNumber;
        private @Nullable Integer pageSize;
        private List<GetPortfoliosPortfolio> portfolios;
        private @Nullable String productId;
        private @Nullable String scope;
        private @Nullable String sortBy;
        private @Nullable String sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPortfoliosResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pageNumber = defaults.pageNumber;
    	      this.pageSize = defaults.pageSize;
    	      this.portfolios = defaults.portfolios;
    	      this.productId = defaults.productId;
    	      this.scope = defaults.scope;
    	      this.sortBy = defaults.sortBy;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pageNumber(@Nullable Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Builder pageSize(@Nullable Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Builder portfolios(List<GetPortfoliosPortfolio> portfolios) {
            this.portfolios = Objects.requireNonNull(portfolios);
            return this;
        }
        public Builder portfolios(GetPortfoliosPortfolio... portfolios) {
            return portfolios(List.of(portfolios));
        }
        public Builder productId(@Nullable String productId) {
            this.productId = productId;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder sortBy(@Nullable String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        public Builder sortOrder(@Nullable String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }        public GetPortfoliosResult build() {
            return new GetPortfoliosResult(id, ids, nameRegex, names, outputFile, pageNumber, pageSize, portfolios, productId, scope, sortBy, sortOrder);
        }
    }
}
