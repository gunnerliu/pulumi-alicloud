// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.inputs.GetAccountAliasArgs;
import com.pulumi.alicloud.ram.inputs.GetAccountAliasPlainArgs;
import com.pulumi.alicloud.ram.inputs.GetAccountAliasesArgs;
import com.pulumi.alicloud.ram.inputs.GetAccountAliasesPlainArgs;
import com.pulumi.alicloud.ram.inputs.GetGroupsArgs;
import com.pulumi.alicloud.ram.inputs.GetGroupsPlainArgs;
import com.pulumi.alicloud.ram.inputs.GetPoliciesArgs;
import com.pulumi.alicloud.ram.inputs.GetPoliciesPlainArgs;
import com.pulumi.alicloud.ram.inputs.GetRolesArgs;
import com.pulumi.alicloud.ram.inputs.GetRolesPlainArgs;
import com.pulumi.alicloud.ram.inputs.GetSamlProvidersArgs;
import com.pulumi.alicloud.ram.inputs.GetSamlProvidersPlainArgs;
import com.pulumi.alicloud.ram.inputs.GetUsersArgs;
import com.pulumi.alicloud.ram.inputs.GetUsersPlainArgs;
import com.pulumi.alicloud.ram.outputs.GetAccountAliasResult;
import com.pulumi.alicloud.ram.outputs.GetAccountAliasesResult;
import com.pulumi.alicloud.ram.outputs.GetGroupsResult;
import com.pulumi.alicloud.ram.outputs.GetPoliciesResult;
import com.pulumi.alicloud.ram.outputs.GetRolesResult;
import com.pulumi.alicloud.ram.outputs.GetSamlProvidersResult;
import com.pulumi.alicloud.ram.outputs.GetUsersResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RamFunctions {
    public static Output<GetAccountAliasResult> getAccountAlias() {
        return getAccountAlias(GetAccountAliasArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountAliasResult> getAccountAliasPlain() {
        return getAccountAliasPlain(GetAccountAliasPlainArgs.Empty, InvokeOptions.Empty);
    }
    public static Output<GetAccountAliasResult> getAccountAlias(GetAccountAliasArgs args) {
        return getAccountAlias(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAccountAliasResult> getAccountAliasPlain(GetAccountAliasPlainArgs args) {
        return getAccountAliasPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetAccountAliasResult> getAccountAlias(GetAccountAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getAccountAlias:getAccountAlias", TypeShape.of(GetAccountAliasResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetAccountAliasResult> getAccountAliasPlain(GetAccountAliasPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getAccountAlias:getAccountAlias", TypeShape.of(GetAccountAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides an alias for the Alibaba Cloud account.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetAccountAliasesResult> getAccountAliases() {
        return getAccountAliases(GetAccountAliasesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides an alias for the Alibaba Cloud account.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAccountAliasesResult> getAccountAliasesPlain() {
        return getAccountAliasesPlain(GetAccountAliasesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides an alias for the Alibaba Cloud account.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetAccountAliasesResult> getAccountAliases(GetAccountAliasesArgs args) {
        return getAccountAliases(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides an alias for the Alibaba Cloud account.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAccountAliasesResult> getAccountAliasesPlain(GetAccountAliasesPlainArgs args) {
        return getAccountAliasesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides an alias for the Alibaba Cloud account.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetAccountAliasesResult> getAccountAliases(GetAccountAliasesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getAccountAliases:getAccountAliases", TypeShape.of(GetAccountAliasesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides an alias for the Alibaba Cloud account.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAccountAliasesResult> getAccountAliasesPlain(GetAccountAliasesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getAccountAliases:getAccountAliases", TypeShape.of(GetAccountAliasesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetGroupsResult> getGroups() {
        return getGroups(GetGroupsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetGroupsResult> getGroupsPlain() {
        return getGroupsPlain(GetGroupsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetGroupsResult> getGroups(GetGroupsArgs args) {
        return getGroups(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetGroupsResult> getGroupsPlain(GetGroupsPlainArgs args) {
        return getGroupsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetGroupsResult> getGroups(GetGroupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getGroups:getGroups", TypeShape.of(GetGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetGroupsResult> getGroupsPlain(GetGroupsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getGroups:getGroups", TypeShape.of(GetGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetPoliciesResult> getPolicies() {
        return getPolicies(GetPoliciesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPoliciesResult> getPoliciesPlain() {
        return getPoliciesPlain(GetPoliciesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetPoliciesResult> getPolicies(GetPoliciesArgs args) {
        return getPolicies(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPoliciesResult> getPoliciesPlain(GetPoliciesPlainArgs args) {
        return getPoliciesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetPoliciesResult> getPolicies(GetPoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getPolicies:getPolicies", TypeShape.of(GetPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM policies in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPoliciesResult> getPoliciesPlain(GetPoliciesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getPolicies:getPolicies", TypeShape.of(GetPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetRolesResult> getRoles() {
        return getRoles(GetRolesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRolesResult> getRolesPlain() {
        return getRolesPlain(GetRolesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetRolesResult> getRoles(GetRolesArgs args) {
        return getRoles(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRolesResult> getRolesPlain(GetRolesPlainArgs args) {
        return getRolesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetRolesResult> getRoles(GetRolesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getRoles:getRoles", TypeShape.of(GetRolesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRolesResult> getRolesPlain(GetRolesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getRoles:getRoles", TypeShape.of(GetRolesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.114.0+.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSamlProvidersResult> getSamlProviders() {
        return getSamlProviders(GetSamlProvidersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.114.0+.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSamlProvidersResult> getSamlProvidersPlain() {
        return getSamlProvidersPlain(GetSamlProvidersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.114.0+.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSamlProvidersResult> getSamlProviders(GetSamlProvidersArgs args) {
        return getSamlProviders(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.114.0+.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSamlProvidersResult> getSamlProvidersPlain(GetSamlProvidersPlainArgs args) {
        return getSamlProvidersPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.114.0+.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetSamlProvidersResult> getSamlProviders(GetSamlProvidersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getSamlProviders:getSamlProviders", TypeShape.of(GetSamlProvidersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ram Saml Providers of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.114.0+.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSamlProvidersResult> getSamlProvidersPlain(GetSamlProvidersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getSamlProviders:getSamlProviders", TypeShape.of(GetSamlProvidersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUsersResult> getUsers() {
        return getUsers(GetUsersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain() {
        return getUsersPlain(GetUsersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUsersResult> getUsers(GetUsersArgs args) {
        return getUsers(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args) {
        return getUsersPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUsersResult> getUsers(GetUsersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ram/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of RAM users in an Alibaba Cloud account according to the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ram/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
}
