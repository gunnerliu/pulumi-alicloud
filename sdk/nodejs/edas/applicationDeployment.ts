// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class ApplicationDeployment extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationDeployment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationDeploymentState, opts?: pulumi.CustomResourceOptions): ApplicationDeployment {
        return new ApplicationDeployment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:edas/applicationDeployment:ApplicationDeployment';

    /**
     * Returns true if the given object is an instance of ApplicationDeployment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationDeployment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationDeployment.__pulumiType;
    }

    /**
     * The ID of the application that you want to deploy.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * Last package version deployed.
     */
    public /*out*/ readonly lastPackageVersion!: pulumi.Output<string>;
    /**
     * The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     */
    public readonly packageVersion!: pulumi.Output<string | undefined>;
    /**
     * The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     */
    public readonly warUrl!: pulumi.Output<string>;

    /**
     * Create a ApplicationDeployment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationDeploymentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationDeploymentArgs | ApplicationDeploymentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ApplicationDeploymentState | undefined;
            inputs["appId"] = state ? state.appId : undefined;
            inputs["groupId"] = state ? state.groupId : undefined;
            inputs["lastPackageVersion"] = state ? state.lastPackageVersion : undefined;
            inputs["packageVersion"] = state ? state.packageVersion : undefined;
            inputs["warUrl"] = state ? state.warUrl : undefined;
        } else {
            const args = argsOrState as ApplicationDeploymentArgs | undefined;
            if (!args || args.appId === undefined) {
                throw new Error("Missing required property 'appId'");
            }
            if (!args || args.groupId === undefined) {
                throw new Error("Missing required property 'groupId'");
            }
            if (!args || args.warUrl === undefined) {
                throw new Error("Missing required property 'warUrl'");
            }
            inputs["appId"] = args ? args.appId : undefined;
            inputs["groupId"] = args ? args.groupId : undefined;
            inputs["packageVersion"] = args ? args.packageVersion : undefined;
            inputs["warUrl"] = args ? args.warUrl : undefined;
            inputs["lastPackageVersion"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ApplicationDeployment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationDeployment resources.
 */
export interface ApplicationDeploymentState {
    /**
     * The ID of the application that you want to deploy.
     */
    readonly appId?: pulumi.Input<string>;
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     */
    readonly groupId?: pulumi.Input<string>;
    /**
     * Last package version deployed.
     */
    readonly lastPackageVersion?: pulumi.Input<string>;
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
 * The set of arguments for constructing a ApplicationDeployment resource.
 */
export interface ApplicationDeploymentArgs {
    /**
     * The ID of the application that you want to deploy.
     */
    readonly appId: pulumi.Input<string>;
    /**
     * The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
     */
    readonly groupId: pulumi.Input<string>;
    /**
     * The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
     */
    readonly packageVersion?: pulumi.Input<string>;
    /**
     * The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
     */
    readonly warUrl: pulumi.Input<string>;
}
