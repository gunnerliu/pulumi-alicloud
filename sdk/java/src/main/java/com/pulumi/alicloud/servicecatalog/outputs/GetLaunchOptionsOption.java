// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.outputs;

import com.pulumi.alicloud.servicecatalog.outputs.GetLaunchOptionsOptionConstraintSummary;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLaunchOptionsOption {
    /**
     * @return List of constraints.
     * 
     */
    private final List<GetLaunchOptionsOptionConstraintSummary> constraintSummaries;
    /**
     * @return ID of Service Catalog Launch Option.
     * 
     */
    private final String id;
    /**
     * @return Product mix ID.
     * 
     */
    private final String portfolioId;
    /**
     * @return Product portfolio name.
     * 
     */
    private final String portfolioName;

    @CustomType.Constructor
    private GetLaunchOptionsOption(
        @CustomType.Parameter("constraintSummaries") List<GetLaunchOptionsOptionConstraintSummary> constraintSummaries,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("portfolioId") String portfolioId,
        @CustomType.Parameter("portfolioName") String portfolioName) {
        this.constraintSummaries = constraintSummaries;
        this.id = id;
        this.portfolioId = portfolioId;
        this.portfolioName = portfolioName;
    }

    /**
     * @return List of constraints.
     * 
     */
    public List<GetLaunchOptionsOptionConstraintSummary> constraintSummaries() {
        return this.constraintSummaries;
    }
    /**
     * @return ID of Service Catalog Launch Option.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Product mix ID.
     * 
     */
    public String portfolioId() {
        return this.portfolioId;
    }
    /**
     * @return Product portfolio name.
     * 
     */
    public String portfolioName() {
        return this.portfolioName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchOptionsOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetLaunchOptionsOptionConstraintSummary> constraintSummaries;
        private String id;
        private String portfolioId;
        private String portfolioName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchOptionsOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintSummaries = defaults.constraintSummaries;
    	      this.id = defaults.id;
    	      this.portfolioId = defaults.portfolioId;
    	      this.portfolioName = defaults.portfolioName;
        }

        public Builder constraintSummaries(List<GetLaunchOptionsOptionConstraintSummary> constraintSummaries) {
            this.constraintSummaries = Objects.requireNonNull(constraintSummaries);
            return this;
        }
        public Builder constraintSummaries(GetLaunchOptionsOptionConstraintSummary... constraintSummaries) {
            return constraintSummaries(List.of(constraintSummaries));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = Objects.requireNonNull(portfolioId);
            return this;
        }
        public Builder portfolioName(String portfolioName) {
            this.portfolioName = Objects.requireNonNull(portfolioName);
            return this;
        }        public GetLaunchOptionsOption build() {
            return new GetLaunchOptionsOption(constraintSummaries, id, portfolioId, portfolioName);
        }
    }
}
