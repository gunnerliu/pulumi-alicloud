// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EDAS application resource.
 * 
 * > **NOTE:** Available in 1.82.0+
 * 
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/edas_application.html.markdown.
 */
export class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState, opts?: pulumi.CustomResourceOptions): Application {
        return new Application(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:edas/application:Application';

    /**
     * Returns true if the given object is an instance of Application.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Application {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Application.__pulumiType;
    }

    /**
     * Name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
     */
    public readonly applicationName!: pulumi.Output<string>;
    /**
     * The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the "Pack ID" column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
     */
    public readonly buildPackId!: pulumi.Output<number | undefined>;
    /**
     * The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter. 
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The description of the application that you want to create.
     */
    public readonly descriotion!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     */
    public readonly ecuInfos!: pulumi.Output<string[] | undefined>;
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     */
    public readonly groupId!: pulumi.Output<string | undefined>;
    /**
     * The URL for health checking of the application.
     */
    public readonly healthCheckUrl!: pulumi.Output<string | undefined>;
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     */
    public readonly logicalRegionId!: pulumi.Output<string | undefined>;
    /**
     * The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
     */
    public readonly packageType!: pulumi.Output<string>;
    /**
     * The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     */
    public readonly packageVersion!: pulumi.Output<string | undefined>;
    /**
     * The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     */
    public readonly warUrl!: pulumi.Output<string | undefined>;

    /**
     * Create a Application resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationArgs | ApplicationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ApplicationState | undefined;
            inputs["applicationName"] = state ? state.applicationName : undefined;
            inputs["buildPackId"] = state ? state.buildPackId : undefined;
            inputs["clusterId"] = state ? state.clusterId : undefined;
            inputs["descriotion"] = state ? state.descriotion : undefined;
            inputs["ecuInfos"] = state ? state.ecuInfos : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["healthCheckUrl"] = state ? state.healthCheckUrl : undefined;
            inputs["logicalRegionId"] = state ? state.logicalRegionId : undefined;
            inputs["packageType"] = state ? state.packageType : undefined;
            inputs["packageVersion"] = state ? state.packageVersion : undefined;
            inputs["warUrl"] = state ? state.warUrl : undefined;
        } else {
            const args = argsOrState as ApplicationArgs | undefined;
            if (!args || args.applicationName === undefined) {
                throw new Error("Missing required property 'applicationName'");
            }
            if (!args || args.clusterId === undefined) {
                throw new Error("Missing required property 'clusterId'");
            }
            if (!args || args.packageType === undefined) {
                throw new Error("Missing required property 'packageType'");
            }
            inputs["applicationName"] = args ? args.applicationName : undefined;
            inputs["buildPackId"] = args ? args.buildPackId : undefined;
            inputs["clusterId"] = args ? args.clusterId : undefined;
            inputs["descriotion"] = args ? args.descriotion : undefined;
            inputs["ecuInfos"] = args ? args.ecuInfos : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["healthCheckUrl"] = args ? args.healthCheckUrl : undefined;
            inputs["logicalRegionId"] = args ? args.logicalRegionId : undefined;
            inputs["packageType"] = args ? args.packageType : undefined;
            inputs["packageVersion"] = args ? args.packageVersion : undefined;
            inputs["warUrl"] = args ? args.warUrl : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Application.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    /**
     * Name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
     */
    readonly applicationName?: pulumi.Input<string>;
    /**
     * The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the "Pack ID" column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
     */
    readonly buildPackId?: pulumi.Input<number>;
    /**
     * The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter. 
     */
    readonly clusterId?: pulumi.Input<string>;
    /**
     * The description of the application that you want to create.
     */
    readonly descriotion?: pulumi.Input<string>;
    /**
     * The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     */
    readonly ecuInfos?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The URL for health checking of the application.
     */
    readonly healthCheckUrl?: pulumi.Input<string>;
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     */
    readonly logicalRegionId?: pulumi.Input<string>;
    /**
     * The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
     */
    readonly packageType?: pulumi.Input<string>;
    /**
     * The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     */
    readonly packageVersion?: pulumi.Input<string>;
    /**
     * The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     */
    readonly warUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    /**
     * Name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
     */
    readonly applicationName: pulumi.Input<string>;
    /**
     * The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the "Pack ID" column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
     */
    readonly buildPackId?: pulumi.Input<number>;
    /**
     * The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter. 
     */
    readonly clusterId: pulumi.Input<string>;
    /**
     * The description of the application that you want to create.
     */
    readonly descriotion?: pulumi.Input<string>;
    /**
     * The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
     */
    readonly ecuInfos?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * The URL for health checking of the application.
     */
    readonly healthCheckUrl?: pulumi.Input<string>;
    /**
     * The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
     */
    readonly logicalRegionId?: pulumi.Input<string>;
    /**
     * The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
     */
    readonly packageType: pulumi.Input<string>;
    /**
     * The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     */
    readonly packageVersion?: pulumi.Input<string>;
    /**
     * The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     */
    readonly warUrl?: pulumi.Input<string>;
}