// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a CDN Accelerated Domain resource.
//
// For information about domain config and how to use it, see [Batch set config](https://www.alibabacloud.com/help/zh/doc-detail/90915.htm)
//
// > **NOTE:** Available in v1.34.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/cdn"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		domain, err := cdn.NewDomainNew(ctx, "domain", &cdn.DomainNewArgs{
// 			DomainName: pulumi.String(fmt.Sprintf("%v%v%v", "tf-testacc", "%", "d.xiaozhu.com")),
// 			CdnType:    pulumi.String("web"),
// 			Scope:      pulumi.String("overseas"),
// 			Sources: &cdn.DomainNewSourcesArgs{
// 				Content:  pulumi.String("1.1.1.1"),
// 				Type:     pulumi.String("ipaddr"),
// 				Priority: pulumi.Int(20),
// 				Port:     pulumi.Int(80),
// 				Weight:   pulumi.Int(15),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cdn.NewDomainConfig(ctx, "config", &cdn.DomainConfigArgs{
// 			DomainName:   domain.DomainName,
// 			FunctionName: pulumi.String("ip_allow_list_set"),
// 			FunctionArgs: cdn.DomainConfigFunctionArgArray{
// 				&cdn.DomainConfigFunctionArgArgs{
// 					ArgName:  pulumi.String("ip_list"),
// 					ArgValue: pulumi.String("110.110.110.110"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// CDN domain config can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cdn/domainConfig:DomainConfig example cdn:config-abc123456
// ```
type DomainConfig struct {
	pulumi.CustomResourceState

	// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// The args of the domain config.
	FunctionArgs DomainConfigFunctionArgArrayOutput `pulumi:"functionArgs"`
	// The name of the domain config.
	FunctionName pulumi.StringOutput `pulumi:"functionName"`
}

// NewDomainConfig registers a new resource with the given unique name, arguments, and options.
func NewDomainConfig(ctx *pulumi.Context,
	name string, args *DomainConfigArgs, opts ...pulumi.ResourceOption) (*DomainConfig, error) {
	if args == nil || args.DomainName == nil {
		return nil, errors.New("missing required argument 'DomainName'")
	}
	if args == nil || args.FunctionArgs == nil {
		return nil, errors.New("missing required argument 'FunctionArgs'")
	}
	if args == nil || args.FunctionName == nil {
		return nil, errors.New("missing required argument 'FunctionName'")
	}
	if args == nil {
		args = &DomainConfigArgs{}
	}
	var resource DomainConfig
	err := ctx.RegisterResource("alicloud:cdn/domainConfig:DomainConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainConfig gets an existing DomainConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainConfigState, opts ...pulumi.ResourceOption) (*DomainConfig, error) {
	var resource DomainConfig
	err := ctx.ReadResource("alicloud:cdn/domainConfig:DomainConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainConfig resources.
type domainConfigState struct {
	// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName *string `pulumi:"domainName"`
	// The args of the domain config.
	FunctionArgs []DomainConfigFunctionArg `pulumi:"functionArgs"`
	// The name of the domain config.
	FunctionName *string `pulumi:"functionName"`
}

type DomainConfigState struct {
	// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringPtrInput
	// The args of the domain config.
	FunctionArgs DomainConfigFunctionArgArrayInput
	// The name of the domain config.
	FunctionName pulumi.StringPtrInput
}

func (DomainConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainConfigState)(nil)).Elem()
}

type domainConfigArgs struct {
	// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName string `pulumi:"domainName"`
	// The args of the domain config.
	FunctionArgs []DomainConfigFunctionArg `pulumi:"functionArgs"`
	// The name of the domain config.
	FunctionName string `pulumi:"functionName"`
}

// The set of arguments for constructing a DomainConfig resource.
type DomainConfigArgs struct {
	// Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
	DomainName pulumi.StringInput
	// The args of the domain config.
	FunctionArgs DomainConfigFunctionArgArrayInput
	// The name of the domain config.
	FunctionName pulumi.StringInput
}

func (DomainConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainConfigArgs)(nil)).Elem()
}

type DomainConfigInput interface {
	pulumi.Input

	ToDomainConfigOutput() DomainConfigOutput
	ToDomainConfigOutputWithContext(ctx context.Context) DomainConfigOutput
}

func (DomainConfig) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainConfig)(nil)).Elem()
}

func (i DomainConfig) ToDomainConfigOutput() DomainConfigOutput {
	return i.ToDomainConfigOutputWithContext(context.Background())
}

func (i DomainConfig) ToDomainConfigOutputWithContext(ctx context.Context) DomainConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainConfigOutput)
}

type DomainConfigOutput struct {
	*pulumi.OutputState
}

func (DomainConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainConfigOutput)(nil)).Elem()
}

func (o DomainConfigOutput) ToDomainConfigOutput() DomainConfigOutput {
	return o
}

func (o DomainConfigOutput) ToDomainConfigOutputWithContext(ctx context.Context) DomainConfigOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(DomainConfigOutput{})
}
