// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.drds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancesPlainArgs Empty = new GetInstancesPlainArgs();

    /**
     * A regex string to filter results by instance description.
     * 
     */
    @Import(name="descriptionRegex")
    private @Nullable String descriptionRegex;

    /**
     * @return A regex string to filter results by instance description.
     * 
     */
    public Optional<String> descriptionRegex() {
        return Optional.ofNullable(this.descriptionRegex);
    }

    /**
     * A list of DRDS instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of DRDS instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by instance description. It is deprecated since v1.91.0 and will be removed in a future release, please use &#39;description_regex&#39; instead.
     * 
     * @deprecated
     * Field &#39;name_regex&#39; is deprecated and will be removed in a future release. Please use &#39;description_regex&#39; instead.
     * 
     */
    @Deprecated /* Field 'name_regex' is deprecated and will be removed in a future release. Please use 'description_regex' instead. */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by instance description. It is deprecated since v1.91.0 and will be removed in a future release, please use &#39;description_regex&#39; instead.
     * 
     * @deprecated
     * Field &#39;name_regex&#39; is deprecated and will be removed in a future release. Please use &#39;description_regex&#39; instead.
     * 
     */
    @Deprecated /* Field 'name_regex' is deprecated and will be removed in a future release. Please use 'description_regex' instead. */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetInstancesPlainArgs() {}

    private GetInstancesPlainArgs(GetInstancesPlainArgs $) {
        this.descriptionRegex = $.descriptionRegex;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancesPlainArgs $;

        public Builder() {
            $ = new GetInstancesPlainArgs();
        }

        public Builder(GetInstancesPlainArgs defaults) {
            $ = new GetInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param descriptionRegex A regex string to filter results by instance description.
         * 
         * @return builder
         * 
         */
        public Builder descriptionRegex(@Nullable String descriptionRegex) {
            $.descriptionRegex = descriptionRegex;
            return this;
        }

        /**
         * @param ids A list of DRDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of DRDS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by instance description. It is deprecated since v1.91.0 and will be removed in a future release, please use &#39;description_regex&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name_regex&#39; is deprecated and will be removed in a future release. Please use &#39;description_regex&#39; instead.
         * 
         */
        @Deprecated /* Field 'name_regex' is deprecated and will be removed in a future release. Please use 'description_regex' instead. */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetInstancesPlainArgs build() {
            return $;
        }
    }

}
