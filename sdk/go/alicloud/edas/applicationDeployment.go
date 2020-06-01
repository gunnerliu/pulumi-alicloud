// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package edas

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type ApplicationDeployment struct {
	pulumi.CustomResourceState

	// The ID of the application that you want to deploy.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// Last package version deployed.
	LastPackageVersion pulumi.StringOutput `pulumi:"lastPackageVersion"`
	// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
	PackageVersion pulumi.StringPtrOutput `pulumi:"packageVersion"`
	// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
	WarUrl pulumi.StringOutput `pulumi:"warUrl"`
}

// NewApplicationDeployment registers a new resource with the given unique name, arguments, and options.
func NewApplicationDeployment(ctx *pulumi.Context,
	name string, args *ApplicationDeploymentArgs, opts ...pulumi.ResourceOption) (*ApplicationDeployment, error) {
	if args == nil || args.AppId == nil {
		return nil, errors.New("missing required argument 'AppId'")
	}
	if args == nil || args.GroupId == nil {
		return nil, errors.New("missing required argument 'GroupId'")
	}
	if args == nil || args.WarUrl == nil {
		return nil, errors.New("missing required argument 'WarUrl'")
	}
	if args == nil {
		args = &ApplicationDeploymentArgs{}
	}
	var resource ApplicationDeployment
	err := ctx.RegisterResource("alicloud:edas/applicationDeployment:ApplicationDeployment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationDeployment gets an existing ApplicationDeployment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationDeployment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationDeploymentState, opts ...pulumi.ResourceOption) (*ApplicationDeployment, error) {
	var resource ApplicationDeployment
	err := ctx.ReadResource("alicloud:edas/applicationDeployment:ApplicationDeployment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationDeployment resources.
type applicationDeploymentState struct {
	// The ID of the application that you want to deploy.
	AppId *string `pulumi:"appId"`
	// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
	GroupId *string `pulumi:"groupId"`
	// Last package version deployed.
	LastPackageVersion *string `pulumi:"lastPackageVersion"`
	// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
	PackageVersion *string `pulumi:"packageVersion"`
	// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
	WarUrl *string `pulumi:"warUrl"`
}

type ApplicationDeploymentState struct {
	// The ID of the application that you want to deploy.
	AppId pulumi.StringPtrInput
	// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
	GroupId pulumi.StringPtrInput
	// Last package version deployed.
	LastPackageVersion pulumi.StringPtrInput
	// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
	PackageVersion pulumi.StringPtrInput
	// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
	WarUrl pulumi.StringPtrInput
}

func (ApplicationDeploymentState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationDeploymentState)(nil)).Elem()
}

type applicationDeploymentArgs struct {
	// The ID of the application that you want to deploy.
	AppId string `pulumi:"appId"`
	// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
	GroupId string `pulumi:"groupId"`
	// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
	PackageVersion *string `pulumi:"packageVersion"`
	// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
	WarUrl string `pulumi:"warUrl"`
}

// The set of arguments for constructing a ApplicationDeployment resource.
type ApplicationDeploymentArgs struct {
	// The ID of the application that you want to deploy.
	AppId pulumi.StringInput
	// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
	GroupId pulumi.StringInput
	// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
	PackageVersion pulumi.StringPtrInput
	// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
	WarUrl pulumi.StringInput
}

func (ApplicationDeploymentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationDeploymentArgs)(nil)).Elem()
}
