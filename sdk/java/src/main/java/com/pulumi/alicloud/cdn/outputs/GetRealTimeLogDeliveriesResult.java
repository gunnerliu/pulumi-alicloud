// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.outputs;

import com.pulumi.alicloud.cdn.outputs.GetRealTimeLogDeliveriesDelivery;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRealTimeLogDeliveriesResult {
    private final List<GetRealTimeLogDeliveriesDelivery> deliveries;
    private final String domain;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String outputFile;
    private final @Nullable String status;

    @CustomType.Constructor
    private GetRealTimeLogDeliveriesResult(
        @CustomType.Parameter("deliveries") List<GetRealTimeLogDeliveriesDelivery> deliveries,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.deliveries = deliveries;
        this.domain = domain;
        this.id = id;
        this.outputFile = outputFile;
        this.status = status;
    }

    public List<GetRealTimeLogDeliveriesDelivery> deliveries() {
        return this.deliveries;
    }
    public String domain() {
        return this.domain;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRealTimeLogDeliveriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRealTimeLogDeliveriesDelivery> deliveries;
        private String domain;
        private String id;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRealTimeLogDeliveriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveries = defaults.deliveries;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        public Builder deliveries(List<GetRealTimeLogDeliveriesDelivery> deliveries) {
            this.deliveries = Objects.requireNonNull(deliveries);
            return this;
        }
        public Builder deliveries(GetRealTimeLogDeliveriesDelivery... deliveries) {
            return deliveries(List.of(deliveries));
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetRealTimeLogDeliveriesResult build() {
            return new GetRealTimeLogDeliveriesResult(deliveries, domain, id, outputFile, status);
        }
    }
}
