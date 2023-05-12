// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.alicloud.eventbridge.outputs.GetEventBusesBus;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventBusesResult {
    private final List<GetEventBusesBus> buses;
    private final @Nullable String eventBusType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String namePrefix;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetEventBusesResult(
        @CustomType.Parameter("buses") List<GetEventBusesBus> buses,
        @CustomType.Parameter("eventBusType") @Nullable String eventBusType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("namePrefix") @Nullable String namePrefix,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.buses = buses;
        this.eventBusType = eventBusType;
        this.id = id;
        this.ids = ids;
        this.namePrefix = namePrefix;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    public List<GetEventBusesBus> buses() {
        return this.buses;
    }
    public Optional<String> eventBusType() {
        return Optional.ofNullable(this.eventBusType);
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
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventBusesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEventBusesBus> buses;
        private @Nullable String eventBusType;
        private String id;
        private List<String> ids;
        private @Nullable String namePrefix;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventBusesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buses = defaults.buses;
    	      this.eventBusType = defaults.eventBusType;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.namePrefix = defaults.namePrefix;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder buses(List<GetEventBusesBus> buses) {
            this.buses = Objects.requireNonNull(buses);
            return this;
        }
        public Builder buses(GetEventBusesBus... buses) {
            return buses(List.of(buses));
        }
        public Builder eventBusType(@Nullable String eventBusType) {
            this.eventBusType = eventBusType;
            return this;
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
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
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
        }        public GetEventBusesResult build() {
            return new GetEventBusesResult(buses, eventBusType, id, ids, namePrefix, nameRegex, names, outputFile);
        }
    }
}
