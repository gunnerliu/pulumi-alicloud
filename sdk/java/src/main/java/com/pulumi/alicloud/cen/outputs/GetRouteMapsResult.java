// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetRouteMapsMap;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteMapsResult {
    /**
     * @return The ID of the CEN instance.
     * 
     */
    private String cenId;
    /**
     * @return The ID of the region to which the CEN instance belongs.
     * 
     */
    private @Nullable String cenRegionId;
    private @Nullable String descriptionRegex;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`. Before 1.161.0, its element is `route_map_id`.
     * 
     */
    private List<String> ids;
    /**
     * @return A list of CEN instances. Each element contains the following attributes:
     * 
     */
    private List<GetRouteMapsMap> maps;
    private @Nullable String outputFile;
    /**
     * @return The status of the route map.
     * 
     */
    private @Nullable String status;
    /**
     * @return The direction in which the route map is applied.
     * 
     */
    private @Nullable String transmitDirection;

    private GetRouteMapsResult() {}
    /**
     * @return The ID of the CEN instance.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return The ID of the region to which the CEN instance belongs.
     * 
     */
    public Optional<String> cenRegionId() {
        return Optional.ofNullable(this.cenRegionId);
    }
    public Optional<String> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of CEN route map IDs. Each item formats as `&lt;cen_id&gt;:&lt;route_map_id&gt;`. Before 1.161.0, its element is `route_map_id`.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of CEN instances. Each element contains the following attributes:
     * 
     */
    public List<GetRouteMapsMap> maps() {
        return this.maps;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the route map.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The direction in which the route map is applied.
     * 
     */
    public Optional<String> transmitDirection() {
        return Optional.ofNullable(this.transmitDirection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteMapsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cenId;
        private @Nullable String cenRegionId;
        private @Nullable String descriptionRegex;
        private String id;
        private List<String> ids;
        private List<GetRouteMapsMap> maps;
        private @Nullable String outputFile;
        private @Nullable String status;
        private @Nullable String transmitDirection;
        public Builder() {}
        public Builder(GetRouteMapsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cenId = defaults.cenId;
    	      this.cenRegionId = defaults.cenRegionId;
    	      this.descriptionRegex = defaults.descriptionRegex;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.maps = defaults.maps;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.transmitDirection = defaults.transmitDirection;
        }

        @CustomType.Setter
        public Builder cenId(String cenId) {
            this.cenId = Objects.requireNonNull(cenId);
            return this;
        }
        @CustomType.Setter
        public Builder cenRegionId(@Nullable String cenRegionId) {
            this.cenRegionId = cenRegionId;
            return this;
        }
        @CustomType.Setter
        public Builder descriptionRegex(@Nullable String descriptionRegex) {
            this.descriptionRegex = descriptionRegex;
            return this;
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
        public Builder maps(List<GetRouteMapsMap> maps) {
            this.maps = Objects.requireNonNull(maps);
            return this;
        }
        public Builder maps(GetRouteMapsMap... maps) {
            return maps(List.of(maps));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transmitDirection(@Nullable String transmitDirection) {
            this.transmitDirection = transmitDirection;
            return this;
        }
        public GetRouteMapsResult build() {
            final var _resultValue = new GetRouteMapsResult();
            _resultValue.cenId = cenId;
            _resultValue.cenRegionId = cenRegionId;
            _resultValue.descriptionRegex = descriptionRegex;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.maps = maps;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.transmitDirection = transmitDirection;
            return _resultValue;
        }
    }
}
