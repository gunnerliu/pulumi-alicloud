// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetHpcClustersCluster;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHpcClustersResult {
    private List<GetHpcClustersCluster> clusters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;

    private GetHpcClustersResult() {}
    public List<GetHpcClustersCluster> clusters() {
        return this.clusters;
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

    public static Builder builder(GetHpcClustersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetHpcClustersCluster> clusters;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetHpcClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusters = defaults.clusters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder clusters(List<GetHpcClustersCluster> clusters) {
            this.clusters = Objects.requireNonNull(clusters);
            return this;
        }
        public Builder clusters(GetHpcClustersCluster... clusters) {
            return clusters(List.of(clusters));
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
        public GetHpcClustersResult build() {
            final var _resultValue = new GetHpcClustersResult();
            _resultValue.clusters = clusters;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
