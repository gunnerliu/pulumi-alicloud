// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp.outputs;

import com.pulumi.alicloud.amqp.outputs.GetExchangesExchange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExchangesResult {
    private List<GetExchangesExchange> exchanges;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private String instanceId;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private String virtualHostName;

    private GetExchangesResult() {}
    public List<GetExchangesExchange> exchanges() {
        return this.exchanges;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String virtualHostName() {
        return this.virtualHostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExchangesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetExchangesExchange> exchanges;
        private String id;
        private List<String> ids;
        private String instanceId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private String virtualHostName;
        public Builder() {}
        public Builder(GetExchangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchanges = defaults.exchanges;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.virtualHostName = defaults.virtualHostName;
        }

        @CustomType.Setter
        public Builder exchanges(List<GetExchangesExchange> exchanges) {
            this.exchanges = Objects.requireNonNull(exchanges);
            return this;
        }
        public Builder exchanges(GetExchangesExchange... exchanges) {
            return exchanges(List.of(exchanges));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder virtualHostName(String virtualHostName) {
            this.virtualHostName = Objects.requireNonNull(virtualHostName);
            return this;
        }
        public GetExchangesResult build() {
            final var o = new GetExchangesResult();
            o.exchanges = exchanges;
            o.id = id;
            o.ids = ids;
            o.instanceId = instanceId;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.virtualHostName = virtualHostName;
            return o;
        }
    }
}
