// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetTransitRoutersTransitRouter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitRoutersResult {
    /**
     * @return The ID of the CEN instance.
     * 
     */
    private String cenId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of  CEN Transit Routers names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The status of the transit router attachment.
     * 
     */
    private @Nullable String status;
    /**
     * @return The ID of the transit router.
     * 
     */
    private @Nullable String transitRouterId;
    private @Nullable List<String> transitRouterIds;
    /**
     * @return A list of CEN Transit Routers. Each element contains the following attributes:
     * 
     */
    private List<GetTransitRoutersTransitRouter> transitRouters;

    private GetTransitRoutersResult() {}
    /**
     * @return The ID of the CEN instance.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of  CEN Transit Routers names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the transit router attachment.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The ID of the transit router.
     * 
     */
    public Optional<String> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }
    public List<String> transitRouterIds() {
        return this.transitRouterIds == null ? List.of() : this.transitRouterIds;
    }
    /**
     * @return A list of CEN Transit Routers. Each element contains the following attributes:
     * 
     */
    public List<GetTransitRoutersTransitRouter> transitRouters() {
        return this.transitRouters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitRoutersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cenId;
        private String id;
        private @Nullable List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        private @Nullable String transitRouterId;
        private @Nullable List<String> transitRouterIds;
        private List<GetTransitRoutersTransitRouter> transitRouters;
        public Builder() {}
        public Builder(GetTransitRoutersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cenId = defaults.cenId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.transitRouterId = defaults.transitRouterId;
    	      this.transitRouterIds = defaults.transitRouterIds;
    	      this.transitRouters = defaults.transitRouters;
        }

        @CustomType.Setter
        public Builder cenId(String cenId) {
            this.cenId = Objects.requireNonNull(cenId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterId(@Nullable String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterIds(@Nullable List<String> transitRouterIds) {
            this.transitRouterIds = transitRouterIds;
            return this;
        }
        public Builder transitRouterIds(String... transitRouterIds) {
            return transitRouterIds(List.of(transitRouterIds));
        }
        @CustomType.Setter
        public Builder transitRouters(List<GetTransitRoutersTransitRouter> transitRouters) {
            this.transitRouters = Objects.requireNonNull(transitRouters);
            return this;
        }
        public Builder transitRouters(GetTransitRoutersTransitRouter... transitRouters) {
            return transitRouters(List.of(transitRouters));
        }
        public GetTransitRoutersResult build() {
            final var _resultValue = new GetTransitRoutersResult();
            _resultValue.cenId = cenId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.transitRouterId = transitRouterId;
            _resultValue.transitRouterIds = transitRouterIds;
            _resultValue.transitRouters = transitRouters;
            return _resultValue;
        }
    }
}
