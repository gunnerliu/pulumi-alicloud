// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.elasticsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancesArgs Empty = new GetInstancesArgs();

    @Import(name="descriptionRegex")
    private @Nullable Output<String> descriptionRegex;

    public Optional<Output<String>> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }

    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetInstancesArgs() {}

    private GetInstancesArgs(GetInstancesArgs $) {
        this.descriptionRegex = $.descriptionRegex;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.tags = $.tags;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancesArgs $;

        public Builder() {
            $ = new GetInstancesArgs();
        }

        public Builder(GetInstancesArgs defaults) {
            $ = new GetInstancesArgs(Objects.requireNonNull(defaults));
        }

        public Builder descriptionRegex(@Nullable Output<String> descriptionRegex) {
            $.descriptionRegex = descriptionRegex;
            return this;
        }

        public Builder descriptionRegex(String descriptionRegex) {
            return descriptionRegex(Output.of(descriptionRegex));
        }

        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GetInstancesArgs build() {
            return $;
        }
    }

}
