// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package fc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages an asynchronous invocation configuration for a FC Function or Alias.\
//  For the detailed information, please refer to the [developer guide](https://www.alibabacloud.com/help/doc-detail/181866.htm).
//
// > **NOTE:** Available in 1.100.0+
//
// ## Example Usage
// ### Destination Configuration
//
// > **NOTE** Ensure the FC Function RAM Role has necessary permissions for the destination, such as `mns:SendMessage`, `mns:PublishMessage` or `fc:InvokeFunction`, otherwise the API will return a generic error.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/fc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := fc.NewFunctionAsyncInvokeConfig(ctx, "example", &fc.FunctionAsyncInvokeConfigArgs{
// 			ServiceName:  pulumi.Any(alicloud_fc_service.Example.Name),
// 			FunctionName: pulumi.Any(alicloud_fc_function.Example.Name),
// 			DestinationConfig: &fc.FunctionAsyncInvokeConfigDestinationConfigArgs{
// 				OnFailure: &fc.FunctionAsyncInvokeConfigDestinationConfigOnFailureArgs{
// 					Destination: pulumi.Any(the_example_mns_queue_arn),
// 				},
// 				OnSuccess: &fc.FunctionAsyncInvokeConfigDestinationConfigOnSuccessArgs{
// 					Destination: pulumi.Any(the_example_mns_topic_arn),
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
// ### Error Handling Configuration
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/fc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := fc.NewFunctionAsyncInvokeConfig(ctx, "example", &fc.FunctionAsyncInvokeConfigArgs{
// 			ServiceName:              pulumi.Any(alicloud_fc_service.Example.Name),
// 			FunctionName:             pulumi.Any(alicloud_fc_function.Example.Name),
// 			MaximumEventAgeInSeconds: pulumi.Int(60),
// 			MaximumRetryAttempts:     pulumi.Int(0),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Configuration for Function Latest Unpublished Version
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/fc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := fc.NewFunctionAsyncInvokeConfig(ctx, "example", &fc.FunctionAsyncInvokeConfigArgs{
// 			ServiceName:  pulumi.Any(alicloud_fc_service.Example.Name),
// 			FunctionName: pulumi.Any(alicloud_fc_function.Example.Name),
// 			Qualifier:    pulumi.String("LATEST"),
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
// Function Compute Function Async Invoke Configs can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig example my_function
// ```
type FunctionAsyncInvokeConfig struct {
	pulumi.CustomResourceState

	// The date this resource was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Configuration block with destination configuration. See below for details.
	DestinationConfig FunctionAsyncInvokeConfigDestinationConfigPtrOutput `pulumi:"destinationConfig"`
	// Name of the Function Compute Function.
	FunctionName pulumi.StringOutput `pulumi:"functionName"`
	// The date this resource was last modified.
	LastModifiedTime pulumi.StringOutput `pulumi:"lastModifiedTime"`
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds pulumi.IntPtrOutput `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrOutput `pulumi:"maximumRetryAttempts"`
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier pulumi.StringPtrOutput `pulumi:"qualifier"`
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
}

// NewFunctionAsyncInvokeConfig registers a new resource with the given unique name, arguments, and options.
func NewFunctionAsyncInvokeConfig(ctx *pulumi.Context,
	name string, args *FunctionAsyncInvokeConfigArgs, opts ...pulumi.ResourceOption) (*FunctionAsyncInvokeConfig, error) {
	if args == nil || args.FunctionName == nil {
		return nil, errors.New("missing required argument 'FunctionName'")
	}
	if args == nil || args.ServiceName == nil {
		return nil, errors.New("missing required argument 'ServiceName'")
	}
	if args == nil {
		args = &FunctionAsyncInvokeConfigArgs{}
	}
	var resource FunctionAsyncInvokeConfig
	err := ctx.RegisterResource("alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunctionAsyncInvokeConfig gets an existing FunctionAsyncInvokeConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunctionAsyncInvokeConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionAsyncInvokeConfigState, opts ...pulumi.ResourceOption) (*FunctionAsyncInvokeConfig, error) {
	var resource FunctionAsyncInvokeConfig
	err := ctx.ReadResource("alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FunctionAsyncInvokeConfig resources.
type functionAsyncInvokeConfigState struct {
	// The date this resource was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Configuration block with destination configuration. See below for details.
	DestinationConfig *FunctionAsyncInvokeConfigDestinationConfig `pulumi:"destinationConfig"`
	// Name of the Function Compute Function.
	FunctionName *string `pulumi:"functionName"`
	// The date this resource was last modified.
	LastModifiedTime *string `pulumi:"lastModifiedTime"`
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds *int `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts *int `pulumi:"maximumRetryAttempts"`
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier *string `pulumi:"qualifier"`
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName *string `pulumi:"serviceName"`
}

type FunctionAsyncInvokeConfigState struct {
	// The date this resource was created.
	CreatedTime pulumi.StringPtrInput
	// Configuration block with destination configuration. See below for details.
	DestinationConfig FunctionAsyncInvokeConfigDestinationConfigPtrInput
	// Name of the Function Compute Function.
	FunctionName pulumi.StringPtrInput
	// The date this resource was last modified.
	LastModifiedTime pulumi.StringPtrInput
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds pulumi.IntPtrInput
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrInput
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier pulumi.StringPtrInput
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName pulumi.StringPtrInput
}

func (FunctionAsyncInvokeConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionAsyncInvokeConfigState)(nil)).Elem()
}

type functionAsyncInvokeConfigArgs struct {
	// Configuration block with destination configuration. See below for details.
	DestinationConfig *FunctionAsyncInvokeConfigDestinationConfig `pulumi:"destinationConfig"`
	// Name of the Function Compute Function.
	FunctionName string `pulumi:"functionName"`
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds *int `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts *int `pulumi:"maximumRetryAttempts"`
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier *string `pulumi:"qualifier"`
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName string `pulumi:"serviceName"`
}

// The set of arguments for constructing a FunctionAsyncInvokeConfig resource.
type FunctionAsyncInvokeConfigArgs struct {
	// Configuration block with destination configuration. See below for details.
	DestinationConfig FunctionAsyncInvokeConfigDestinationConfigPtrInput
	// Name of the Function Compute Function.
	FunctionName pulumi.StringInput
	// Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds pulumi.IntPtrInput
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrInput
	// Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
	Qualifier pulumi.StringPtrInput
	// Name of the Function Compute Function, omitting any version or alias qualifier.
	ServiceName pulumi.StringInput
}

func (FunctionAsyncInvokeConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionAsyncInvokeConfigArgs)(nil)).Elem()
}

type FunctionAsyncInvokeConfigInput interface {
	pulumi.Input

	ToFunctionAsyncInvokeConfigOutput() FunctionAsyncInvokeConfigOutput
	ToFunctionAsyncInvokeConfigOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigOutput
}

func (FunctionAsyncInvokeConfig) ElementType() reflect.Type {
	return reflect.TypeOf((*FunctionAsyncInvokeConfig)(nil)).Elem()
}

func (i FunctionAsyncInvokeConfig) ToFunctionAsyncInvokeConfigOutput() FunctionAsyncInvokeConfigOutput {
	return i.ToFunctionAsyncInvokeConfigOutputWithContext(context.Background())
}

func (i FunctionAsyncInvokeConfig) ToFunctionAsyncInvokeConfigOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAsyncInvokeConfigOutput)
}

type FunctionAsyncInvokeConfigOutput struct {
	*pulumi.OutputState
}

func (FunctionAsyncInvokeConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FunctionAsyncInvokeConfigOutput)(nil)).Elem()
}

func (o FunctionAsyncInvokeConfigOutput) ToFunctionAsyncInvokeConfigOutput() FunctionAsyncInvokeConfigOutput {
	return o
}

func (o FunctionAsyncInvokeConfigOutput) ToFunctionAsyncInvokeConfigOutputWithContext(ctx context.Context) FunctionAsyncInvokeConfigOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(FunctionAsyncInvokeConfigOutput{})
}
