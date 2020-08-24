// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// This resource will help you to manager Container Registry Enterprise Edition repositories.
//
// For information about Container Registry Enterprise Edition repository and how to use it, see [Create a Repository](https://www.alibabacloud.com/help/doc-detail/145291.htm)
//
// > **NOTE:** Available in v1.86.0+.
//
// > **NOTE:** You need to set your registry password in Container Registry Enterprise Edition console before use this resource.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cs"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cs.NewRegistryEnterpriseNamespace(ctx, "my_namespace", &cs.RegistryEnterpriseNamespaceArgs{
// 			AutoCreate:        pulumi.Bool(false),
// 			DefaultVisibility: pulumi.String("PUBLIC"),
// 			InstanceId:        pulumi.String("cri-xxx"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cs.NewRegistryEnterpriseRepo(ctx, "my_repo", &cs.RegistryEnterpriseRepoArgs{
// 			Detail:     pulumi.String("this is a public repo"),
// 			InstanceId: my_namespace.InstanceId,
// 			Namespace:  my_namespace.Name,
// 			RepoType:   pulumi.String("PUBLIC"),
// 			Summary:    pulumi.String("this is summary of my new repo"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type RegistryEnterpriseRepo struct {
	pulumi.CustomResourceState

	// The repository specific information. MarkDown format is supported, and the length limit is 2000.
	Detail pulumi.StringPtrOutput `pulumi:"detail"`
	// ID of Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
	Namespace pulumi.StringOutput `pulumi:"namespace"`
	// The uuid of Container Registry Enterprise Edition repository.
	RepoId pulumi.StringOutput `pulumi:"repoId"`
	// `PUBLIC` or `PRIVATE`, repo's visibility.
	RepoType pulumi.StringOutput `pulumi:"repoType"`
	// The repository general information. It can contain 1 to 100 characters.
	Summary pulumi.StringOutput `pulumi:"summary"`
}

// NewRegistryEnterpriseRepo registers a new resource with the given unique name, arguments, and options.
func NewRegistryEnterpriseRepo(ctx *pulumi.Context,
	name string, args *RegistryEnterpriseRepoArgs, opts ...pulumi.ResourceOption) (*RegistryEnterpriseRepo, error) {
	if args == nil || args.InstanceId == nil {
		return nil, errors.New("missing required argument 'InstanceId'")
	}
	if args == nil || args.Namespace == nil {
		return nil, errors.New("missing required argument 'Namespace'")
	}
	if args == nil || args.RepoType == nil {
		return nil, errors.New("missing required argument 'RepoType'")
	}
	if args == nil || args.Summary == nil {
		return nil, errors.New("missing required argument 'Summary'")
	}
	if args == nil {
		args = &RegistryEnterpriseRepoArgs{}
	}
	var resource RegistryEnterpriseRepo
	err := ctx.RegisterResource("alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistryEnterpriseRepo gets an existing RegistryEnterpriseRepo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistryEnterpriseRepo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryEnterpriseRepoState, opts ...pulumi.ResourceOption) (*RegistryEnterpriseRepo, error) {
	var resource RegistryEnterpriseRepo
	err := ctx.ReadResource("alicloud:cs/registryEnterpriseRepo:RegistryEnterpriseRepo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegistryEnterpriseRepo resources.
type registryEnterpriseRepoState struct {
	// The repository specific information. MarkDown format is supported, and the length limit is 2000.
	Detail *string `pulumi:"detail"`
	// ID of Container Registry Enterprise Edition instance.
	InstanceId *string `pulumi:"instanceId"`
	// Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
	Name *string `pulumi:"name"`
	// Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
	Namespace *string `pulumi:"namespace"`
	// The uuid of Container Registry Enterprise Edition repository.
	RepoId *string `pulumi:"repoId"`
	// `PUBLIC` or `PRIVATE`, repo's visibility.
	RepoType *string `pulumi:"repoType"`
	// The repository general information. It can contain 1 to 100 characters.
	Summary *string `pulumi:"summary"`
}

type RegistryEnterpriseRepoState struct {
	// The repository specific information. MarkDown format is supported, and the length limit is 2000.
	Detail pulumi.StringPtrInput
	// ID of Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringPtrInput
	// Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
	Name pulumi.StringPtrInput
	// Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
	Namespace pulumi.StringPtrInput
	// The uuid of Container Registry Enterprise Edition repository.
	RepoId pulumi.StringPtrInput
	// `PUBLIC` or `PRIVATE`, repo's visibility.
	RepoType pulumi.StringPtrInput
	// The repository general information. It can contain 1 to 100 characters.
	Summary pulumi.StringPtrInput
}

func (RegistryEnterpriseRepoState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryEnterpriseRepoState)(nil)).Elem()
}

type registryEnterpriseRepoArgs struct {
	// The repository specific information. MarkDown format is supported, and the length limit is 2000.
	Detail *string `pulumi:"detail"`
	// ID of Container Registry Enterprise Edition instance.
	InstanceId string `pulumi:"instanceId"`
	// Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
	Name *string `pulumi:"name"`
	// Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
	Namespace string `pulumi:"namespace"`
	// `PUBLIC` or `PRIVATE`, repo's visibility.
	RepoType string `pulumi:"repoType"`
	// The repository general information. It can contain 1 to 100 characters.
	Summary string `pulumi:"summary"`
}

// The set of arguments for constructing a RegistryEnterpriseRepo resource.
type RegistryEnterpriseRepoArgs struct {
	// The repository specific information. MarkDown format is supported, and the length limit is 2000.
	Detail pulumi.StringPtrInput
	// ID of Container Registry Enterprise Edition instance.
	InstanceId pulumi.StringInput
	// Name of Container Registry Enterprise Edition repository. It can contain 2 to 64 characters.
	Name pulumi.StringPtrInput
	// Name of Container Registry Enterprise Edition namespace where repository is located. It can contain 2 to 30 characters.
	Namespace pulumi.StringInput
	// `PUBLIC` or `PRIVATE`, repo's visibility.
	RepoType pulumi.StringInput
	// The repository general information. It can contain 1 to 100 characters.
	Summary pulumi.StringInput
}

func (RegistryEnterpriseRepoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryEnterpriseRepoArgs)(nil)).Elem()
}
