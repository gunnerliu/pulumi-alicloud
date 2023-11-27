// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetRegionRouteEntriesEntry;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionRouteEntriesResult {
    /**
     * @return A list of CEN Route Entries. Each element contains the following attributes:
     * 
     */
    private List<GetRegionRouteEntriesEntry> entries;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    private @Nullable String outputFile;
    private String regionId;

    private GetRegionRouteEntriesResult() {}
    /**
     * @return A list of CEN Route Entries. Each element contains the following attributes:
     * 
     */
    public List<GetRegionRouteEntriesEntry> entries() {
        return this.entries;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String regionId() {
        return this.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionRouteEntriesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRegionRouteEntriesEntry> entries;
        private String id;
        private String instanceId;
        private @Nullable String outputFile;
        private String regionId;
        public Builder() {}
        public Builder(GetRegionRouteEntriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entries = defaults.entries;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.outputFile = defaults.outputFile;
    	      this.regionId = defaults.regionId;
        }

        @CustomType.Setter
        public Builder entries(List<GetRegionRouteEntriesEntry> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public Builder entries(GetRegionRouteEntriesEntry... entries) {
            return entries(List.of(entries));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public GetRegionRouteEntriesResult build() {
            final var _resultValue = new GetRegionRouteEntriesResult();
            _resultValue.entries = entries;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.outputFile = outputFile;
            _resultValue.regionId = regionId;
            return _resultValue;
        }
    }
}
