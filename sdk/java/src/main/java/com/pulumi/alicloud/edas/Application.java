// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.edas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.edas.ApplicationArgs;
import com.pulumi.alicloud.edas.inputs.ApplicationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an EDAS ecs application on EDAS. The application will be deployed when `group_id` and `war_url` are given.
 * 
 * &gt; **NOTE:** Available in 1.82.0+
 * 
 * ## Import
 * 
 * EDAS application can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:edas/application:Application app app_Id
 * ```
 * 
 */
@ResourceType(type="alicloud:edas/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * Name of your EDAS application. Only letters &#39;-&#39; &#39;_&#39; and numbers are allowed. The length cannot exceed 36 characters.
     * 
     */
    @Export(name="applicationName", type=String.class, parameters={})
    private Output<String> applicationName;

    /**
     * @return Name of your EDAS application. Only letters &#39;-&#39; &#39;_&#39; and numbers are allowed. The length cannot exceed 36 characters.
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }
    /**
     * The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the &#34;Pack ID&#34; column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
     * 
     */
    @Export(name="buildPackId", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> buildPackId;

    /**
     * @return The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the &#34;Pack ID&#34; column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
     * 
     */
    public Output<Optional<Integer>> buildPackId() {
        return Codegen.optional(this.buildPackId);
    }
    /**
     * The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The description of the application that you want to create.
     * 
     */
    @Export(name="descriotion", type=String.class, parameters={})
    private Output</* @Nullable */ String> descriotion;

    /**
     * @return The description of the application that you want to create.
     * 
     */
    public Output<Optional<String>> descriotion() {
        return Codegen.optional(this.descriotion);
    }
    /**
     * The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     * 
     */
    @Export(name="ecuInfos", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ecuInfos;

    /**
     * @return The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     * 
     */
    public Output<Optional<List<String>>> ecuInfos() {
        return Codegen.optional(this.ecuInfos);
    }
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupId;

    /**
     * @return The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     * 
     */
    public Output<Optional<String>> groupId() {
        return Codegen.optional(this.groupId);
    }
    /**
     * The URL for health checking of the application.
     * 
     */
    @Export(name="healthCheckUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckUrl;

    /**
     * @return The URL for health checking of the application.
     * 
     */
    public Output<Optional<String>> healthCheckUrl() {
        return Codegen.optional(this.healthCheckUrl);
    }
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     * 
     */
    @Export(name="logicalRegionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> logicalRegionId;

    /**
     * @return The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     * 
     */
    public Output<Optional<String>> logicalRegionId() {
        return Codegen.optional(this.logicalRegionId);
    }
    /**
     * The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
     * 
     */
    @Export(name="packageType", type=String.class, parameters={})
    private Output<String> packageType;

    /**
     * @return The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
     * 
     */
    public Output<String> packageType() {
        return this.packageType;
    }
    /**
     * The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     * 
     */
    @Export(name="packageVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> packageVersion;

    /**
     * @return The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     * 
     */
    public Output<Optional<String>> packageVersion() {
        return Codegen.optional(this.packageVersion);
    }
    /**
     * The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     * 
     */
    @Export(name="warUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> warUrl;

    /**
     * @return The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     * 
     */
    public Output<Optional<String>> warUrl() {
        return Codegen.optional(this.warUrl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:edas/application:Application", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
