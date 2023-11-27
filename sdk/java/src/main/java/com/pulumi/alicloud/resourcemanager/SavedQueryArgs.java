// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SavedQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final SavedQueryArgs Empty = new SavedQueryArgs();

    /**
     * Query Description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Query Description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Query Expression.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Query Expression.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="savedQueryName", required=true)
    private Output<String> savedQueryName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> savedQueryName() {
        return this.savedQueryName;
    }

    private SavedQueryArgs() {}

    private SavedQueryArgs(SavedQueryArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.savedQueryName = $.savedQueryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SavedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SavedQueryArgs $;

        public Builder() {
            $ = new SavedQueryArgs();
        }

        public Builder(SavedQueryArgs defaults) {
            $ = new SavedQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Query Description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Query Description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression Query Expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Query Expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param savedQueryName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder savedQueryName(Output<String> savedQueryName) {
            $.savedQueryName = savedQueryName;
            return this;
        }

        /**
         * @param savedQueryName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder savedQueryName(String savedQueryName) {
            return savedQueryName(Output.of(savedQueryName));
        }

        public SavedQueryArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.savedQueryName = Objects.requireNonNull($.savedQueryName, "expected parameter 'savedQueryName' to be non-null");
            return $;
        }
    }

}
